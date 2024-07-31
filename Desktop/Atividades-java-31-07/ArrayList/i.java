import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorDeTarefas {
    public static void main(String[] args) {
        ArrayList<String> tarefas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nGerenciador de Tarefas:");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Remover tarefa");
            System.out.println("3. Listar tarefas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha após a leitura de um inteiro

            switch (opcao) {
                case 1:
                    System.out.print("Digite a nova tarefa: ");
                    String tarefa = scanner.nextLine();
                    tarefas.add(tarefa);
                    System.out.println("Tarefa adicionada!");
                    break;
                case 2:
                    System.out.print("Digite o índice da tarefa a ser removida: ");
                    int indice = scanner.nextInt();
                    if (indice >= 0 && indice < tarefas.size()) {
                        tarefas.remove(indice);
                        System.out.println("Tarefa removida!");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;
                case 3:
                    System.out.println("Lista de Tarefas:");
                    for (int i = 0; i < tarefas.size(); i++) {
                        System.out.println(i + ": " + tarefas.get(i));
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
