package teste;

import org.junit.Test;
import sistema.model.Aluno;
import sistema.model.Nota;
import sistema.service.RegistroNotas;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AlterarNotasTest {

    RegistroNotas registro = new RegistroNotas();

    @Test
    public void testAlterarNotaERecalcularMedia() {
        Nota notaProva = new Nota("Prova", 8.5);
        Nota notaTrabalho = new Nota("Trabalho", 7.0);

        List<Nota> notas = new ArrayList<>();
        notas.add(notaProva);
        notas.add(notaTrabalho);

        Aluno aluno = new Aluno("João Silva", "12345", "Engenharia", notas);

        registro.registrarNota(aluno.getMatricula(), notaProva);
        registro.registrarNota(aluno.getMatricula(), notaTrabalho);

        // Alterando a nota do aluno
        aluno.alterarNota("Prova", 9.0);

        assertEquals(9.0, aluno.getNotas().get(0).getValor(), 0.0001);
        assertEquals(8.0, aluno.calcularMedia(), 0.0001);
    }


}
