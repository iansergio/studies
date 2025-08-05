package teste;

import org.junit.Test;
import sistema.model.Aluno;

import static org.junit.Assert.assertEquals;

public class AprovacaoReprovacaoTest {

    @Test
    public void testAprovacaoAluno() {
        Aluno joao = new Aluno("João Silva", 7.7);
        assertEquals("Aprovado", joao.calcularSituacao(), "O aluno deve ser aprovado.");
    }

    @Test
    public void testReprovacaoAluno() {
        Aluno carlos = new Aluno("Carlos Pereira", 4.5);
        assertEquals("Reprovado", carlos.calcularSituacao(), "O aluno deve ser reprovado.");
    }

}
