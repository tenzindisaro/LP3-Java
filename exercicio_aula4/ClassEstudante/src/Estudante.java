public class Estudante {
    private String nome;
    private int idade;
    private double nota;
    public Estudante(String nome, int idade, double nota ){
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }

    public boolean aprovado(){
        boolean b;
        if(idade >= 7 ){
            return b = true;
        }
        else {
            return b = false;
        }
    }
}
