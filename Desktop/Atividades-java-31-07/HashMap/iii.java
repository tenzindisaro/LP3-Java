import java.util.HashMap;
import java.util.Scanner;

public class InformacoesContato {
    public static void main(String[] args) {
        HashMap<String, String> contatos = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nGerenciador de Contatos:");
            System.out.println("1. Adicionar contato");
            System.out.println("2. Remover contato");
            System.out.println("3. Buscar contato");
            System.out.println("4. Listar todos os contatos");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha após a leitura de um inteiro

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do contato: ");
                    String nomeAdicionar = scanner.nextLine();
                    System.out.print("Digite o telefone: ");
                    String telefoneAdicionar = scanner.nextLine();
                    contatos.put(nomeAdicionar, telefoneAdicionar);
                    System.out.println("Contato adicionado!");
                    break;
                case 2:
                    System.out.print("Digite o nome do contato a ser removido: ");
                    String nomeRemover = scanner.nextLine();
                    if (contatos.remove(nomeRemover) != null) {
                        System.out.println("Contato removido!");
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Digite o nome do contato a ser buscado: ");
                    String nomeBuscar = scanner.nextLine();
                    String telefone = contatos.get(nomeBuscar);
                    if (telefone != null) {
                        System.out.println("Telefone de " + nomeBuscar + ": " + telefone);
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("Lista de Contatos:");
                    for (String nome : contatos.keySet()) {
                        System.out.println(nome + ": " + contatos.get(nome));
                    }
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}
