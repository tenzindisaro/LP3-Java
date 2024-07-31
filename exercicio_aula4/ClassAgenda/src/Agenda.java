import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Compromisso> compromissos;

    public Agenda(){
       this.compromissos = new ArrayList<>();
    }

    public void adicionarCompromisso(Compromisso addCompromisso){
        compromissos.add(addCompromisso);
    }

    public List<Compromisso> getCompromissosData(String data){
        List<Compromisso> compromissosData = new ArrayList<>();

        for (Compromisso compromisso : compromissos){
            if (compromisso.getData().equals(data)){
                compromissosData.add(compromisso);
            }
        }
        return compromissosData;
    }
}
