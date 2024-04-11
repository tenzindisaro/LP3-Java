public class Main {
    public static void main(String[] args) {
        int nota = 7;
        String nome = "Joaão";
        int idade = 28;
        Estudante estudante = new Estudante(nome, idade, nota);
        boolean aprovado = estudante.aprovado();
        if(aprovado == true){
            System.out.println("Estudante foi aprovado!");
        }
        else {
            System.out.println("Estudante foi reprovado!");
        }

    }
}