package teste;

import org.junit.Test;
import sistema.model.Aluno;
import sistema.model.Nota;
import sistema.service.RegistroNotas;
import static org.junit.Assert.assertEquals;

public class RegistroNotaTest {

    @Test
    public void testRegistrarNotas() {
        RegistroNotas registro = new RegistroNotas();

        Aluno aluno = new Aluno("João Silva", "12345", "Engenharia");
        Nota notaProva = new Nota("Prova", 8.5);
        Nota notaTrabalho = new Nota("Trabalho", 7.0);

        registro.registrarNota(aluno.getMatricula(), notaProva);
        registro.registrarNota(aluno.getMatricula(), notaTrabalho);

        assertEquals(2, registro.obterNotas(aluno.getMatricula()).size());
    }

}
