package com.gfilipeprojects.gamelist.controllers;

import com.gfilipeprojects.gamelist.dto.GameListDTO;
import com.gfilipeprojects.gamelist.dto.GameMinDTO;
import com.gfilipeprojects.gamelist.services.GameListService;
import com.gfilipeprojects.gamelist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
    @Autowired
    private GameListService gameListService;
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAllLists() {
        List<GameListDTO> result = gameListService.findAllLists();
        return result;
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findGamesByList(@PathVariable Long listId) {
        List<GameMinDTO> result = gameService.searchGamesByList(listId);
        return result;
    }
}
