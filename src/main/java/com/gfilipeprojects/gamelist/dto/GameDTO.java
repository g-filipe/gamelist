package com.gfilipeprojects.gamelist.dto;

import com.gfilipeprojects.gamelist.entities.Game;
import lombok.*;
import org.springframework.beans.BeanUtils;

@NoArgsConstructor
@Getter
@Setter
public class GameDTO {

    private Long id;
    private String title;
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    //Cópia Manual
//    public GameDTO (Game entity) {
//        id = entity.getId();
//        title = entity.getTitle();
//        year = entity.getYear();
//        genre = entity.getGenre();
//        platforms = entity.getPlatforms();
//        score = entity.getScore();
//        imgUrl = entity.getImgUrl();
//        shortDescription = entity.getShortDescription();
//        longDescription = entity.getLongDescription();
//    }

    public GameDTO (Game entity) {
        BeanUtils.copyProperties(entity, this);
    }

}
