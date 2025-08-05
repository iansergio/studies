package sistema.service;

import sistema.model.Nota;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RegistroNotas {

    private Map<String, List<Nota>> notasAlunos = new HashMap<>();

    public void registrarNota(String matricula, Nota nota) {
        notasAlunos.putIfAbsent(matricula, new ArrayList<>());
        notasAlunos.get(matricula).add(nota);
    }

    public List<Nota> obterNotas(String matricula) {
        return notasAlunos.get(matricula);
    }

}
