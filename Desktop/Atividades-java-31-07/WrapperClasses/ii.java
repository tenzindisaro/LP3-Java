package wrapper;

import java.util.Arrays;
import java.util.List;

public class SomaEMedia {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(10, 20, 30, 40, 50);
        int soma = calcularSoma(numeros);
        double media = calcularMedia(numeros);

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
    }

    public static int calcularSoma(List<Integer> numeros) {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return soma;
    }

    public static double calcularMedia(List<Integer> numeros) {
        if (numeros.isEmpty()) {
            return 0;
        }
        return (double) calcularSoma(numeros) / numeros.size();
    }
}
