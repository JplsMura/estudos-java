package estruturarepeticao;

public class DoWhile {
    public static void main(String[] args) {
        int contador = 0;

        do {
            System.out.println("Contador do while: " + contador);
            contador++;
        } while (contador <= 5);
    }
}
