package teste;

import org.junit.Test;
import sistema.model.Aluno;
import sistema.model.Relatorio;

import static org.junit.Assert.assertTrue;

public class RelatorioDesempenhoTest {

    @Test
    public void testGerarRelatorioCompleto() {
        Aluno joao = new Aluno("João Silva", 7.7);
        Relatorio relatorio = new Relatorio();
        relatorio.adicionarAluno(joao);

        String relatorioCompleto = relatorio.gerarRelatorio();

        assertTrue(relatorioCompleto.contains("João Silva"));
        assertTrue(relatorioCompleto.contains("7.7"));
        assertTrue(relatorioCompleto.contains("Aprovado"));
    }

}
