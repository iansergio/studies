package teste;

import org.junit.Test;
import sistema.model.Aluno;
import sistema.model.Nota;
import sistema.service.ExibicaoNotas;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class ExibicaoNotasTest {

    @Test
    public void testExibirNotasEMedia() {
        Nota notaProva = new Nota("Prova", 7.5);
        Nota notaTrabalho = new Nota("Trabalho", 8.0);

        List<Nota> notas = new ArrayList<>();

        notas.add(notaProva);
        notas.add(notaTrabalho);

        Aluno aluno = new Aluno("João Silva", "12345", "Engenharia", notas);

        String relatorio = ExibicaoNotas.gerarRelatorio(aluno);

        assertTrue(relatorio.contains("João Silva"));
        assertTrue(relatorio.contains("Prova: 7.5"));
        assertTrue(relatorio.contains("Trabalho: 8.0"));
        assertTrue(relatorio.contains("Média Final: 7.75"));
        assertTrue(relatorio.contains("Situação: Aprovado"));
    }

}
