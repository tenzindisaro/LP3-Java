import java.util.Calendar;

public class AdicionarDias {
    public static void main(String[] args) {
        Calendar dataOriginal = Calendar.getInstance();
        dataOriginal.set(2023, Calendar.AUGUST, 1); // 1 de Agosto de 2023

        int diasParaAdicionar = 20;
        Calendar novaData = adicionarDias(dataOriginal, diasParaAdicionar);
        System.out.println("Nova data após adicionar " + diasParaAdicionar + " dias: " + novaData.getTime());
    }

    public static Calendar adicionarDias(Calendar data, int dias) {
        Calendar novaData = (Calendar) data.clone();
        novaData.add(Calendar.DAY_OF_MONTH, dias);
        return novaData;
    }
}
