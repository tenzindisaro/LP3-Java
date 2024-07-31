package string;

public class ConstrutorDeFrase {
    public static void main(String[] args) {
        String[] palavras = {"Este", "é", "um", "exemplo", "de", "uso", "do", "StringBuilder"};
        String frase = construirFrase(palavras);
        System.out.println("Frase construída: " + frase);
    }

    public static String construirFrase(String[] palavras) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < palavras.length; i++) {
            sb.append(palavras[i]);
            if (i < palavras.length - 1) {
                sb.append(" "); // Adiciona um espaço entre as palavras
            }
        }

        return sb.toString();
    }
}
