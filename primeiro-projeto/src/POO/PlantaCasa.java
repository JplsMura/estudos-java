package POO;

public class PlantaCasa implements Construcao {

    public int metragem;
    public int numeroQuartos;
    public int numeroBanheiros;
    public String cor;
    public String material;

    public void construir()
    {
        System.out.println("A casa foi construida as caracteristicas sao:");
        System.out.println("Metragem da casa: " + metragem);
        System.out.println("Numero de quartos: " + numeroQuartos);
        System.out.println("Numero de banheiros: " + numeroBanheiros);
        System.out.println("Material ultilizado: " + material);
    }

    public void pintar()
    {
        System.out.println("Cor da casa: " + cor);
    }

    public void mudarCorParede(String novaCor)
    {
        cor = novaCor;
        pintar();
    }

    public int somarMetragem()
    {
        return metragem * numeroBanheiros + numeroQuartos;
    }

    public void mudarCaracteristicas(int metros, int quartos, int banheiros, String materiais)
    {
        metragem = metros;
        numeroQuartos = quartos;
        numeroBanheiros = banheiros;
        material = materiais;
        construir();
    }

    @Override
    public void pintar(String cor) {
        System.out.println("Contruindo a casa com a cor: " + cor);
    }

    @Override
    public int calcularCustoConstrucao(int custoPorMetro) {
        return metragem + custoPorMetro;
    }
}
