package math;

public class GeradorNumeroAleatorio {
    public static void main(String[] args) {
        int numeroAleatorio = gerarNumeroAleatorio(1, 100);
        System.out.println("Número aleatório gerado: " + numeroAleatorio);
    }

    public static int gerarNumeroAleatorio(int min, int max) {
        // Gera um número aleatório entre min e max (inclusive)
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}
