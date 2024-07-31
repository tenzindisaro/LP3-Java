package string;

public class VerificaPalindromo {
    public static void main(String[] args) {
        String frase = "Apos a sopa";
        System.out.println("É palíndromo? " + ehPalindromo(frase));
    }

    public static boolean ehPalindromo(String frase) {
        // Remover espaços, pontuações e converter para minúsculas
        String fraseLimpa = frase.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Inicializar dois índices para verificar os extremos da string
        int inicio = 0;
        int fim = fraseLimpa.length() - 1;

        // Verificar se a string é um palíndromo
        while (inicio < fim) {
            if (fraseLimpa.charAt(inicio) != fraseLimpa.charAt(fim)) {
                return false;
            }
            inicio++;
            fim--;
        }
        return true;
    }
}
