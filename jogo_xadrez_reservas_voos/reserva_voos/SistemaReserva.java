import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SistemaReservas {
    public static void main(String[] args) {
        Voo voo = new Voo("AF123", 10); 

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 15; i++) {
            executorService.submit(new Reserva(voo));
        }

        executorService.shutdown();

        try {
            if (!executorService.awaitTermination(1, TimeUnit.MINUTES)) {
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }
}
