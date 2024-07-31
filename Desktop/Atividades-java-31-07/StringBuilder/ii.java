package string;

public class RemoverVogais {
    public static void main(String[] args) {
        String texto = "Exemplo de String com Vogais";
        String textoSemVogais = removerVogais(texto);
        System.out.println("Texto sem vogais: " + textoSemVogais);
    }

    public static String removerVogais(String texto) {
        StringBuilder sb = new StringBuilder();
        String vogais = "aeiouAEIOU";

        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);
            if (vogais.indexOf(caractere) == -1) {
                sb.append(caractere);
            }
        }

        return sb.toString();
    }
}
