public abstract class Peca {
    protected int x;
    protected int y;
    protected boolean corBranca; 

    public Peca(int x, int y, boolean corBranca) {
        this.x = x;
        this.y = y;
        this.corBranca = corBranca;
    }

    public boolean isCorBranca() {
        return corBranca;
    }

    public abstract boolean mover(int novoX, int novoY, Tabuleiro tabuleiro);

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
