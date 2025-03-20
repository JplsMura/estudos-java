package polimorfismo;

public class Principal {
    public static void main(String[] args) {
        int sabaoPo = 1;
        int sabonente = 2;
        double arroz = 5.90;
        double mamao = 2.50;
        Integer cenoura = 6;
        Integer batata = 7;
        Integer banana = 7;

        int total = Calculadora.somar(sabaoPo, sabonente);
        double totalDouble = Calculadora.somar(arroz, mamao);
        Integer totalInteger = Calculadora.somar(cenoura, batata, banana);

        System.out.println("Calculadora int " + total);
        System.out.println("Calculadora double " + totalDouble);
        System.out.println("Calculadora Integer " + totalInteger);

        Carro fusca = new Carro();
        fusca.mover();
    }
}
