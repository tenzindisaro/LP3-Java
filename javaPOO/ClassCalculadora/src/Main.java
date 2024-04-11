import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Operacao calc = new Operacao();
        Scanner scanner = new Scanner(System.in);

        float x, y, resultado;
        int escolha;
        System.out.println("Passe o X e Y para a opeação:\n");
        x = scanner.nextFloat();
        System.out.println(" ");
        y = scanner.nextFloat();
        System.out.println("\n Passe a operação desejada:\n1- Soma\n2- Subtrair\n3- Multiplicar\n4- Dividir");
        escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                resultado = calc.soma(x, y);
                System.out.println("Resultado da soma: " + resultado);
                break;
            case 2:
                resultado = calc.subtracao(x, y);
                System.out.println("Resultado da subtração: " + resultado);
                break;
            case 3:
                resultado = calc.multiplicacao(x, y);
                System.out.println("Resultado da multiplicação: " + resultado);
                break;
            case 4:
                if (y != 0) {
                    resultado = calc.divisao(x, y);
                    System.out.println("Resultado da divisão: " + resultado);
                } else {
                    System.out.println("Não é possível dividir por zero.");
                }
                break;
            default:
                System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}