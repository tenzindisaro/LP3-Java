public class Reserva implements Runnable {
    private final Voo voo;

    public Reserva(Voo voo) {
        this.voo = voo;
    }

    @Override
    public void run() {
        try {
            // Simula o tempo necessário para fazer a reserva
            Thread.sleep((long) (Math.random() * 1000));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        boolean sucesso = voo.reservarAssento();
        if (!sucesso) {
            System.out.println("Reserva falhou: não há assentos disponíveis.");
        }
    }
}
