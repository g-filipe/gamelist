package com.gfilipeprojects.gamelist.services;

import com.gfilipeprojects.gamelist.dto.GameDTO;
import com.gfilipeprojects.gamelist.dto.GameMinDTO;
import com.gfilipeprojects.gamelist.entities.Game;
import com.gfilipeprojects.gamelist.projections.GameMinProjection;
import com.gfilipeprojects.gamelist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    //Injeção de uma instância do GameRepository no GameService
    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findGameById(Long gameId) {
        Game result = gameRepository.findById(gameId).get();
        GameDTO gameDTO = new GameDTO(result);

        return gameDTO;
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAllGames() {
        List<Game> result = gameRepository.findAll();

        //List<GameMinDTO> gameMinDTOList = result.stream().map(x -> new GameMinDTO(x)).toList();
        List<GameMinDTO> gameMinDTOList = result.stream().map(GameMinDTO::new).toList();

        return gameMinDTOList;
    }
    @Transactional(readOnly = true)
    public List<GameMinDTO> searchGamesByList(Long listId){

        List<GameMinProjection> result = gameRepository.searchGamesByList(listId);

        List<GameMinDTO> gamesByList = result.stream().map(GameMinDTO::new).toList();

        return gamesByList;
    }

}
