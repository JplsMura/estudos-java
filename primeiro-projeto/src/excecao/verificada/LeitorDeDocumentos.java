package excecao.verificada;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeitorDeDocumentos {
    public static void main(String[] args) {

        BufferedReader bufferdReader = null;

        try {
            bufferdReader = new BufferedReader(
                    new FileReader("C:\\Users\\jhe01778\\Desktop\\cartao.txt"));

            String linha;

            while((linha = bufferdReader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo " + e);
            throw new RuntimeException(e);
        }
    }
}
