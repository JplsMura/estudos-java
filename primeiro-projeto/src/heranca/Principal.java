package heranca;

public class Principal {
    public static void main(String[] args) {
        Cachorro caramelo = new Cachorro();
        caramelo.latir();
        caramelo.comer("Ração");
        caramelo.beberAgua();
        caramelo.dormir();

        Galinha carijo = new Galinha();
        carijo.ciscar();
        carijo.comer("Milho");
        carijo.beberAgua();
        carijo.dormir();
    }
}
