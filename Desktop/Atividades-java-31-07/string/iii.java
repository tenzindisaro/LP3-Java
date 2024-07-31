package string;

public class PrimeiraPosicao {
    public static void main(String[] args) {
        String frase = "Exemplo de String";
        char letra = 'e';
        System.out.println("Primeira posição de '" + letra + "': " + encontrarPrimeiraPosicao(frase, letra));
    }

    public static int encontrarPrimeiraPosicao(String frase, char letra) {
        return frase.indexOf(letra);
    }
}
