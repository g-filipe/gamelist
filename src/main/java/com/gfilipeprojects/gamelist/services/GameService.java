package com.gfilipeprojects.gamelist.services;

import com.gfilipeprojects.gamelist.dto.GameMinDTO;
import com.gfilipeprojects.gamelist.entities.Game;
import com.gfilipeprojects.gamelist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    //Injeção de uma instância do GameRepository no GameService
    @Autowired
    private GameRepository gameRepository;
    public List<GameMinDTO> findAllGames() {
        List<Game> result = gameRepository.findAll();

        //List<GameMinDTO> gameMinDTOList = result.stream().map(x -> new GameMinDTO(x)).toList();
        List<GameMinDTO> gameMinDTOList = result.stream().map(GameMinDTO::new).toList();

        return gameMinDTOList;
    }
}
