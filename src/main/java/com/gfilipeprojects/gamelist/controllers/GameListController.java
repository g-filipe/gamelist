package com.gfilipeprojects.gamelist.controllers;

import com.gfilipeprojects.gamelist.dto.GameListDTO;
import com.gfilipeprojects.gamelist.services.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAllLists() {
        List<GameListDTO> result = gameListService.findAllLists();
        return result;
    }
}
