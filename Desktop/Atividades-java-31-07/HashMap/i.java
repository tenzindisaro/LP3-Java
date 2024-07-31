import java.util.HashMap;
import java.util.Scanner;

public class InventarioProdutos {
    public static void main(String[] args) {
        HashMap<String, Integer> inventario = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nGerenciador de Inventário de Produtos:");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Remover produto");
            System.out.println("3. Buscar produto");
            System.out.println("4. Listar todos os produtos");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha após a leitura de um inteiro

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do produto: ");
                    String produtoAdicionar = scanner.nextLine();
                    System.out.print("Digite a quantidade: ");
                    int quantidadeAdicionar = scanner.nextInt();
                    scanner.nextLine(); // Consumir a nova linha após a leitura de um inteiro
                    inventario.put(produtoAdicionar, quantidadeAdicionar);
                    System.out.println("Produto adicionado!");
                    break;
                case 2:
                    System.out.print("Digite o nome do produto a ser removido: ");
                    String produtoRemover = scanner.nextLine();
                    if (inventario.remove(produtoRemover) != null) {
                        System.out.println("Produto removido!");
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Digite o nome do produto a ser buscado: ");
                    String produtoBuscar = scanner.nextLine();
                    Integer quantidade = inventario.get(produtoBuscar);
                    if (quantidade != null) {
                        System.out.println("Quantidade de " + produtoBuscar + ": " + quantidade);
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("Inventário de Produtos:");
                    for (String produto : inventario.keySet()) {
                        System.out.println(produto + ": " + inventario.get(produto));
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
