package com.gfilipeprojects.gamelist.controllers;

import com.gfilipeprojects.gamelist.dto.GameDTO;
import com.gfilipeprojects.gamelist.dto.GameMinDTO;
import com.gfilipeprojects.gamelist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping(value = "/{gameId}")
    public GameDTO findGameById(@PathVariable Long gameId) {
        GameDTO result = gameService.findGameById(gameId);
        return result;
    }
    @GetMapping
    public List<GameMinDTO> findAllGames() {
        List<GameMinDTO> result = gameService.findAllGames();
        return result;
    }
}
