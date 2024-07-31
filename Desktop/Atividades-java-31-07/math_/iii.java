package math;

public class MaiorValorArray {
    public static void main(String[] args) {
        int[] valores = {34, 78, 12, 56, 90, 23, 67}; // Exemplo de array de inteiros
        int valorMaximo = encontrarValorMaximo(valores);
        System.out.println("O maior valor no array é: " + valorMaximo);
    }

    public static int encontrarValorMaximo(int[] dados) {
        if (dados == null || dados.length == 0) {
            throw new IllegalArgumentException("O array não pode ser nulo ou vazio.");
        }

        int max = dados[0]; // Inicializa o valor máximo com o primeiro elemento do array

        // Percorre o array para encontrar o maior valor
        for (int i = 1; i < dados.length; i++) {
            if (dados[i] > max) {
                max = dados[i];
            }
        }

        return max;
    }
}
