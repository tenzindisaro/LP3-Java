public class Tabuleiro {
    private Peca[][] tabuleiro;

    public Tabuleiro() {
        tabuleiro = new Peca[8][8];
    }

    public Peca getPeca(int x, int y) {
        return tabuleiro[x][y];
    }

    public void adicionarPeca(Peca peca) {
        tabuleiro[peca.getX()][peca.getY()] = peca;
    }

    public void moverPeca(Peca peca, int novoX, int novoY) {
        if (peca.mover(novoX, novoY, this)) {
            tabuleiro[peca.getX()][peca.getY()] = null;
            tabuleiro[novoX][novoY] = peca;
        }
    }

    public boolean isPosicaoValida(int x, int y, Peca peca) {
        if (x >= 0 && x < 8 && y >= 0 && y < 8) {
            Peca p = getPeca(x, y);
            return p == null || p.isCorBranca() != peca.isCorBranca();
        }
        return false;
    }
}
