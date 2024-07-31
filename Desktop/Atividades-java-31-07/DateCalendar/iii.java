import java.util.Calendar;

public class CompararDatas {
    public static void main(String[] args) {
        Calendar data1 = Calendar.getInstance();
        data1.set(2023, Calendar.MARCH, 10); // 10 de Março de 2023

        Calendar data2 = Calendar.getInstance();
        data2.set(2023, Calendar.MARCH, 15); // 15 de Março de 2023

        verificarOrdemDatas(data1, data2);
    }

    public static void verificarOrdemDatas(Calendar data1, Calendar data2) {
        if (data1.before(data2)) {
            System.out.println("A data " + data1.getTime() + " é antes da data " + data2.getTime());
        } else if (data1.after(data2)) {
            System.out.println("A data " + data1.getTime() + " é depois da data " + data2.getTime());
        } else {
            System.out.println("As datas são iguais.");
        }
    }
}
