public class Main {
    public static void main(String[] args) {
        String titulo = "Caça as Bruxas";
        String autor = "Cabeça de Ovo";
        int anoDePublicacao = 1992;
        Livro livro = new Livro(titulo, autor, anoDePublicacao);

        livro.imprimirDetalhes();
    }
}