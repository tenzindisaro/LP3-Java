public class Voo {
    private final String numeroVoo;
    private final int capacidadeTotal;
    private int assentosReservados;

    public Voo(String numeroVoo, int capacidadeTotal) {
        this.numeroVoo = numeroVoo;
        this.capacidadeTotal = capacidadeTotal;
        this.assentosReservados = 0;
    }

    public synchronized boolean reservarAssento() {
        if (assentosReservados < capacidadeTotal) {
            assentosReservados++;
            System.out.println("Assento reservado com sucesso. Assentos restantes: " + (capacidadeTotal - assentosReservados));
            return true;
        } else {
            System.out.println("Não há mais assentos disponíveis.");
            return false;
        }
    }

    public String getNumeroVoo() {
        return numeroVoo;
    }

    public int getCapacidadeTotal() {
        return capacidadeTotal;
    }

    public int getAssentosReservados() {
        return assentosReservados;
    }
}
