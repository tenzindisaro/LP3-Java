package wrapper;

public class SomaDeNumerosEmString {
    public static void main(String[] args) {
        String numerosStr = "10 20 30 40 50";
        int soma = calcularSomaDosNumeros(numerosStr);
        System.out.println("Soma total: " + soma);
    }

    public static int calcularSomaDosNumeros(String numerosStr) {
        String[] numerosArray = numerosStr.split(" ");
        int soma = 0;
        for (String numero : numerosArray) {
            soma += Integer.parseInt(numero);
        }
        return soma;
    }
}
