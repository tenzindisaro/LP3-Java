import java.util.ArrayList;
import java.util.Collections;

public class MaiorEMenorValor {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Collections.addAll(numeros, 15, 22, 5, 99, 34, 12);

        int maiorValor = Collections.max(numeros);
        int menorValor = Collections.min(numeros);

        System.out.println("Lista de números: " + numeros);
        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Menor valor: " + menorValor);
    }
}
