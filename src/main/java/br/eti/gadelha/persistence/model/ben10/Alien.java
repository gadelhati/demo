package br.eti.gadelha.persistence.model.ben10;

import br.eti.gadelha.exception.annotation.UniqueTitleTutorial;
import br.eti.gadelha.persistence.model.Abiliity;
import br.eti.gadelha.persistence.model.GenericEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

/**
 * @author	Marcelo Ribeiro Gadelha
 * @mail	gadelha.ti@gmail.com
 * @since	23/04/2021
 * @version 1.0
 * @link	www.gadelha.eti.br
 **/

@Entity @Table @Data @NoArgsConstructor
public class Alien extends GenericEntity {

    @Column //@UniqueTitleTutorial
    private String especie;
    @Column
    private String apelido;
    @Column
    private String corpo;
    @Column
    private boolean published;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
    @JoinColumn(name = "abiliity")
    private Abiliity abiliity;

    public Alien(String especie, String apelido, String corpo, boolean published) {
        this.especie = especie;
        this.apelido = apelido;
        this.corpo = corpo;
        this.published = published;
    }
}