package com.gfilipeprojects.gamelist.repositories;

import com.gfilipeprojects.gamelist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}