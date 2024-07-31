package math;

public class HipotenusaCalculator {
    public static void main(String[] args) {
        double primeiroCateto = 5.0;
        double segundoCateto = 12.0;
        double resultadoHipotenusa = calcularHipotenusa(primeiroCateto, segundoCateto);
        System.out.println("O comprimento da hipotenusa é: " + resultadoHipotenusa);
    }

    public static double calcularHipotenusa(double cateto1, double cateto2) {
        // Usa a função Math.pow para calcular os quadrados e Math.sqrt para a raiz quadrada
        double quadradoCateto1 = Math.pow(cateto1, 2);
        double quadradoCateto2 = Math.pow(cateto2, 2);
        double somaQuadrados = quadradoCateto1 + quadradoCateto2;
        return Math.sqrt(somaQuadrados);
    }
}
