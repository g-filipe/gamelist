package com.gfilipeprojects.gamelist.repositories;

import com.gfilipeprojects.gamelist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}