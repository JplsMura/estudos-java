package estudo;

public class Arrays {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 50, 1};
        String[] frutas;

        frutas = new String[]{"Maçã", "Morango", "Abacaxi"};

        double[] salarios = new double[5];

        salarios[0] = 5000.00;
        salarios[1] = 6000.00;
        salarios[2] = 7000.00;
        salarios[3] = 8000.00;
        salarios[4] = 9000.00;

        // Forma burra de ser feito
        for (int posicao = 0; posicao < salarios.length; posicao++) {
            System.out.println("Salario usando o for de forma burra: " + salarios[posicao]);
        }

        // Forma ideal de ser feito "foreach"
        for (double salario : salarios) {
            System.out.println("Salário usando o for da forma ideal: " + salario);
        }

        salarios[2] = 250.00;

        System.out.println(salarios[2]);
    }
}
