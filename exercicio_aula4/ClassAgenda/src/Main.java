import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Agenda agenda = new Agenda();

        agenda.adicionarCompromisso(new Compromisso("2024-04-07", "10:00", "Reunião de equipe"));
        agenda.adicionarCompromisso(new Compromisso("2024-04-07", "14:00", "Almoço com cliente"));
        agenda.adicionarCompromisso(new Compromisso("2024-04-08", "09:00", "Entrega do projeto"));

        List<Compromisso> compromissosPorData = agenda.getCompromissosData("2024-04-07");

        for (Compromisso compromisso : compromissosPorData){
            System.out.println("Data: " + compromisso.getData() + ", Hora: " + compromisso.getHora() + ", Descrição: " + compromisso.getDescricao());
        }
    }
}