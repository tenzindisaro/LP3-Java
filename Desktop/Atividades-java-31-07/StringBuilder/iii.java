package string;

public class InserirString {
    public static void main(String[] args) {
        String original = "Hello, World!";
        String aInserir = "Beautiful ";
        int posicao = 7;

        String resultado = inserirString(original, aInserir, posicao);
        System.out.println("Resultado após inserção: " + resultado);
    }

    public static String inserirString(String original, String aInserir, int posicao) {
        StringBuilder sb = new StringBuilder(original);

        // Insere a string aInserir na posição especificada
        sb.insert(posicao, aInserir);

        return sb.toString();
    }
}
