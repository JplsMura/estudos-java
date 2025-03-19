package POO;

public class Casa {
    public static void main(String[] args) {
        PlantaCasa casa = new PlantaCasa();

        casa.metragem = 100;
        casa.numeroQuartos = 4;
        casa.numeroBanheiros = 2;
        casa.cor = "Branco";
        casa.material = "Cimento";

        casa.construir();
        casa.pintar();
        casa.mudarCorParede("Amarelo");

        int resultado = casa.somarMetragem();
        System.out.println("Metragem total: " + resultado + '\n');

        casa.mudarCaracteristicas(
                200,
                4,
                2,
                "Pedras"
        );
    }
}
