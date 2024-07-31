import java.util.HashMap;

public class ContarFrequenciaPalavras {
    public static void main(String[] args) {
        String texto = "Java é uma linguagem de programação que é muito popular e amplamente utilizada. Java é também a plataforma.";
        HashMap<String, Integer> frequenciaPalavras = contarFrequencia(texto);
        System.out.println("Frequência de palavras: " + frequenciaPalavras);
    }

    public static HashMap<String, Integer> contarFrequencia(String texto) {
        HashMap<String, Integer> frequencia = new HashMap<>();
        String[] palavras = texto.toLowerCase().replaceAll("[^a-zA-Z ]", "").split("\\s+");

        for (String palavra : palavras) {
            frequencia.put(palavra, frequencia.getOrDefault(palavra, 0) + 1);
        }

        return frequencia;
    }
}
