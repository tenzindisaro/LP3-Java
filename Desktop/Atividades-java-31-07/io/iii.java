import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GravarArrayEmArquivo {
    public static void main(String[] args) {
        String[] linhas = {
            "Primeira linha",
            "Segunda linha",
            "Terceira linha"
        };
        String nomeArquivo = "array.txt"; // Substitua pelo caminho do seu arquivo

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            for (String linha : linhas) {
                writer.write(linha);
                writer.newLine();
            }

            System.out.println("Array gravado com sucesso no arquivo!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
