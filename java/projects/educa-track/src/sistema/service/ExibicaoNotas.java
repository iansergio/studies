package sistema.service;

import sistema.model.Aluno;
import sistema.model.Nota;

public class ExibicaoNotas {

    public static String gerarRelatorio(Aluno aluno) {
        StringBuilder relatorio = new StringBuilder("Relatório do aluno: " + aluno.getNome() + "\n");
        for (Nota nota : aluno.getNotas()) {
            relatorio.append(nota.getTipo()).append(": ").append(nota.getValor()).append("\n");
        }
        relatorio.append("Média Final: ").append(aluno.calcularMedia()).append("\n");
        relatorio.append("Situação: ").append(aluno.calcularMedia() >= 6.0 ? "Aprovado" : "Reprovado").append("\n");
        return relatorio.toString();
    }

}
