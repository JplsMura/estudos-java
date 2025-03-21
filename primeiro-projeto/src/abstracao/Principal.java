package abstracao;

public class Principal {
    public static void main(String[] args) {
        Funcionario joao = new Funcionario(
                "melro",
                "São Paulo",
                "25",
                "SP",
                "07745130",
                "João",
                "469129220",
                "Desenvolvedor"
        );

        Cliente jaquelyne = new Cliente(
                "pedro paulino",
                "Itapevi",
                "SP",
                "07745130",
                "Jaquelyne",
                "11771555670"
        );

        System.out.println(joao);
        joao.mostrarEndereco();
        System.out.println(jaquelyne);
        jaquelyne.mostrarEndereco();
    }
}
