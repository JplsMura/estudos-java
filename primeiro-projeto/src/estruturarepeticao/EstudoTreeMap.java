package estruturarepeticao;

import java.util.Map;
import java.util.TreeMap;

public class EstudoTreeMap {
    public static void main(String[] args) {
        TreeMap<String, Double> notasAlunos = new TreeMap<>();

        notasAlunos.put("João", 8.5);
        notasAlunos.put("Maria", 9.5);
        notasAlunos.put("José", 10.0);
        notasAlunos.put("Hanna", 7.5);
        notasAlunos.put("Luiz", 5.5);

        double notaMinima = 7.0;

        for (Map.Entry<String, Double> entry: notasAlunos.entrySet())  {
            String aluno = entry.getKey();
            Double nota = entry.getValue();

            if (nota >= notaMinima) {
                System.out.println(aluno + " passou com nota: " + nota);
            } else {
                System.out.println(aluno + " reprovou com nota: " + nota);
            }
        }

        /* A unica diferença entre TreeMap e HashMap é que o Tree mantém uma sequência e o Hash não
            assim consigo pegar a primera ou ultima chave dessa estrutura de dados
         */
        System.out.println("Primeira chave: " + notasAlunos.firstKey());
        System.out.println("Ultima chave: " + notasAlunos.lastKey());
    }
}
