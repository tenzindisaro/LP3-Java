package wrapper;

import java.util.ArrayList;
import java.util.List;

public class ConverterStringsParaInteiros {
    public static void main(String[] args) {
        List<String> strings = List.of("10", "20", "30", "40", "50");
        List<Integer> inteiros = converterParaInteiros(strings);
        System.out.println("Lista de inteiros: " + inteiros);
    }

    public static List<Integer> converterParaInteiros(List<String> strings) {
        List<Integer> inteiros = new ArrayList<>();
        for (String s : strings) {
            inteiros.add(Integer.valueOf(s));
        }
        return inteiros;
    }
}
