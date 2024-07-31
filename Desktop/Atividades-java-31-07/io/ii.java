import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopiarArquivo {
    public static void main(String[] args) {
        String arquivoOrigem = "origem.txt"; // Substitua pelo caminho do arquivo de origem
        String arquivoDestino = "destino.txt"; // Substitua pelo caminho do arquivo de destino

        try (BufferedInputStream input = new BufferedInputStream(new FileInputStream(arquivoOrigem));
             BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(arquivoDestino))) {

            byte[] buffer = new byte[1024];
            int bytesLidos;
            while ((bytesLidos = input.read(buffer)) != -1) {
                output.write(buffer, 0, bytesLidos);
            }

            System.out.println("Arquivo copiado com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
