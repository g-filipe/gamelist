package com.gfilipeprojects.gamelist.entities;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of="id")
@Entity
@Table(name="tb_game")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    /*    Palavra reservada do SQL. Necessário utilizar a annotation @Column para customizar o nome
      da coluna no banco de dados */
    @Column(name = "game_year")
    private Integer year;

    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;

    /* O tipo padrão no JPA será o varchar(255). Essa quantidade de caracteres é muito pequena para as descrições, portanto é necessário
   usar a annotation abaixo para informar o tipo TEXT para o banco de dados.*/
    @Column(columnDefinition = "TEXT")
    private String shortDescription;
    @Column(columnDefinition = "TEXT")
    private String longDescription;

}