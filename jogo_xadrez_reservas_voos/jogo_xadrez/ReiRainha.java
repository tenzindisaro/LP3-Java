public class Rei extends Peca {

    public Rei(int x, int y, boolean corBranca) {
        super(x, y, corBranca);
    }

    @Override
    public boolean mover(int novoX, int novoY, Tabuleiro tabuleiro) {
        int deltaX = Math.abs(novoX - this.x);
        int deltaY = Math.abs(novoY - this.y);

        if ((deltaX <= 1 && deltaY <= 1) && tabuleiro.isPosicaoValida(novoX, novoY, this)) {
            this.setPosition(novoX, novoY);
            return true;
        }
        return false;
    }
}

public class Rainha extends Peca {

    public Rainha(int x, int y, boolean corBranca) {
        super(x, y, corBranca);
    }

    @Override
    public boolean mover(int novoX, int novoY, Tabuleiro tabuleiro) {
        int deltaX = Math.abs(novoX - this.x);
        int deltaY = Math.abs(novoY - this.y);

        if ((deltaX == deltaY || novoX == this.x || novoY == this.y) && tabuleiro.isPosicaoValida(novoX, novoY, this)) {
            this.setPosition(novoX, novoY);
            return true;
        }
        return false;
    }
}
