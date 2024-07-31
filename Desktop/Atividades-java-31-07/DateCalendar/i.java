import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class DiferencaDiasEntreDatas {
    public static void main(String[] args) {
        Calendar data1 = Calendar.getInstance();
        data1.set(2023, Calendar.JANUARY, 1); // 1 de Janeiro de 2023

        Calendar data2 = Calendar.getInstance();
        data2.set(2023, Calendar.JULY, 15); // 15 de Julho de 2023

        long diferencaDias = calcularDiferencaEmDias(data1, data2);
        System.out.println("Diferença em dias: " + diferencaDias);
    }

    public static long calcularDiferencaEmDias(Calendar data1, Calendar data2) {
        long diffInMillis = Math.abs(data2.getTimeInMillis() - data1.getTimeInMillis());
        return TimeUnit.DAYS.convert(diffInMillis, TimeUnit.MILLISECONDS);
    }
}
