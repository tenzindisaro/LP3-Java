package string;

public class ContadorDeVogais {
    public static void main(String[] args) {
        String frase = "Exemplo de frase com vogais";
        int numeroDeVogais = contarVogais(frase);
        System.out.println("Número de vogais na frase: " + numeroDeVogais);
    }

    public static int contarVogais(String frase) {
        int contador = 0;
        String vogais = "aeiouAEIOU";

        for (int i = 0; i < frase.length(); i++) {
            char ch = frase.charAt(i);
            if (vogais.indexOf(ch) != -1) {
                contador++;
            }
        }

        return contador;
    }
}
