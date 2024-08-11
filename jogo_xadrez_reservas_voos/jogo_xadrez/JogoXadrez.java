public class JogoXadrez {
    private Tabuleiro tabuleiro;

    public JogoXadrez() {
        tabuleiro = new Tabuleiro();
        inicializarJogo();
    }

    private void inicializarJogo() {
        tabuleiro.adicionarPeca(new Rei(4, 0, true)); // Rei branco
        tabuleiro.adicionarPeca(new Rainha(3, 0, true)); // Rainha branca

        tabuleiro.adicionarPeca(new Rei(4, 7, false)); // Rei preto
        tabuleiro.adicionarPeca(new Rainha(3, 7, false)); // Rainha preta
    }

    public static void main(String[] args) {
        JogoXadrez jogo = new JogoXadrez();
        jogo.jogar();
    }
}
