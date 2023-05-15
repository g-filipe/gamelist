package com.gfilipeprojects.gamelist.services;

import com.gfilipeprojects.gamelist.dto.GameListDTO;
import com.gfilipeprojects.gamelist.entities.GameList;
import com.gfilipeprojects.gamelist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAllLists() {
        List<GameList> result = gameListRepository.findAll();
        List<GameListDTO> gameListDTO = result.stream().map(x -> new GameListDTO(x)).toList();
        return gameListDTO;
    }
}
