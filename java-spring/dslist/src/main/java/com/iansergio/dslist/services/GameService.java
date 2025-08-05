package com.iansergio.dslist.services;

import com.iansergio.dslist.dto.GameDTO;
import com.iansergio.dslist.dto.GameMinDTO;
import com.iansergio.dslist.entities.Game;
import com.iansergio.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public GameDTO findById(Long id) {
        Game result = gameRepository.findById(id).orElse(null);
        return new GameDTO(result);
    }

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
