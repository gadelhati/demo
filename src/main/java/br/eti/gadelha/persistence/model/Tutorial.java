package br.eti.gadelha.persistence.model;

import br.eti.gadelha.exception.annotation.UniqueTitleTutorial;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author	Marcelo Ribeiro Gadelha
 * @mail	gadelha.ti@gmail.com
 * @since	19/06/2020
 * @version 1.0
 * @link	www.gadelha.eti.br
 **/

@Entity @Table @Data @NoArgsConstructor
public class Tutorial {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column //@UniqueTitleTutorial
    private String title;
    @Column
    private String description;
    @Column
    private boolean published;

    public Tutorial(String title, String description, boolean published) {
        this.title = title;
        this.description = description;
        this.published = published;
    }
}