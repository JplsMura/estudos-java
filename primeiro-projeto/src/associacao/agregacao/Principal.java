package associacao.agregacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Funcionarios joao = new Funcionarios("João");
        Funcionarios jaquelyne = new Funcionarios("Jaquelyne");
        Funcionarios cecilia = new Funcionarios("Cecilia");
        Funcionarios jose = new Funcionarios("José");
        List<Funcionarios> listaDeFuncionarios = new ArrayList<>();

        listaDeFuncionarios.add(joao);
        listaDeFuncionarios.add(jaquelyne);
        listaDeFuncionarios.add(cecilia);
        listaDeFuncionarios.add(jose);

        Departamento ti = new Departamento("TI", listaDeFuncionarios);
        ti.mostrarFuncionarios();

        Departamento marketing = new Departamento("Marketing", Collections.emptyList());
        marketing.mostrarFuncionarios();
    }
}
