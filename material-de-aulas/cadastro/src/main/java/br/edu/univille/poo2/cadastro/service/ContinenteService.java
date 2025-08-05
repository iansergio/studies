package br.edu.univille.poo2.cadastro.service;

import br.edu.univille.poo2.cadastro.entity.Continente;
import br.edu.univille.poo2.cadastro.repository.ContinenteRepository;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContinenteService {
    @Autowired
    private ContinenteRepository repository;
    public Optional<Continente> obterPeloId(long id){
        return repository.findById(id);
    }

    public List<Continente> obterTodos(){
        return repository.findAll(Sort.by("nome"));
    }

    public void salvar(Continente continente) {
        if(Strings.isBlank(continente.getNome())){
            throw new RuntimeException("Nome não informado.");
        }
        repository.save(continente);
    }

    public void excluir(Continente continente) {
        repository.delete(continente);
    }
}
