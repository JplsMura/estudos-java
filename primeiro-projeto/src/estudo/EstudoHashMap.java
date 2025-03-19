package estudo;

import java.util.HashMap;
import java.util.Map;

public class EstudoHashMap {
    public static void main(String[] args) {
        HashMap<String, Double> notasAlunos = new HashMap<>();

        notasAlunos.put("João", 8.5);
        notasAlunos.put("Maria", 9.5);
        notasAlunos.put("José", 10.0);
        notasAlunos.put("Hanna", 7.5);
        notasAlunos.put("Luiz", 5.5);

        double notaMinima = 7.0;

        // Formar de iterar um HashMap, buscando pelo key
        for (String nome : notasAlunos.keySet()) {
            double nota = notasAlunos.get(nome);
            System.out.println(nome + " : " + nota);
        }

        // Pega a nota de um aluno no Hash
        double notaAluno = notasAlunos.get("Hanna");
        System.out.println("\n");
        System.out.println("Nota do aluno: " + notaAluno + "\n");

        for (Map.Entry<String, Double> entry: notasAlunos.entrySet())  {
            String aluno = entry.getKey();
            Double nota = entry.getValue();

            if (nota >= notaMinima) {
                System.out.println(aluno + " passou com nota: " + nota);
            } else {
                System.out.println(aluno + " reprovou com nota: " + nota);
            }
        }
    }
}
