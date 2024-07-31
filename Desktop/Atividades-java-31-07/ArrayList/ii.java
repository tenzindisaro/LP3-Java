import java.util.ArrayList;
import java.util.Collections;

public class OrdenarNumeros {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Collections.addAll(numeros, 5, 3, 8, 1, 2, 7);

        System.out.println("Lista antes da ordenação: " + numeros);

        Collections.sort(numeros);

        System.out.println("Lista após a ordenação: " + numeros);
    }
}
