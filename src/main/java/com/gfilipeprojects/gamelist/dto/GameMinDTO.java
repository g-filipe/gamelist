package com.gfilipeprojects.gamelist.dto;

import com.gfilipeprojects.gamelist.entities.Game;
import lombok.*;

@NoArgsConstructor
@Getter
public class GameMinDTO {

//  @Id
//  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
//  @Column(name = "game_year")
    private Integer year;
    private String imgUrl;
//  @Column(columnDefinition = "TEXT")
    private String shortDescription;

    public GameMinDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }
}
