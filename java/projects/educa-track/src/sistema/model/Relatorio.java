package sistema.model;

import java.util.ArrayList;
import java.util.List;

public class Relatorio {
    private List<Aluno> alunos;

    public Relatorio() {
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public String gerarRelatorio() {
        StringBuilder relatorio = new StringBuilder();
        for (Aluno aluno : alunos) {
            relatorio.append("Nome: ").append(aluno.getNome()).append("\n");
            relatorio.append("Média: ").append(aluno.calcularMedia()).append("\n");
            relatorio.append("Situação: ").append(aluno.calcularSituacao()).append("\n\n");
        }
        return relatorio.toString();
    }
}
