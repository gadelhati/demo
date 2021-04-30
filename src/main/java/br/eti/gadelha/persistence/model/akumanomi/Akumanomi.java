package br.eti.gadelha.persistence.model.ben10;

import br.eti.gadelha.exception.annotation.UniqueTitleTutorial;
import br.eti.gadelha.persistence.model.Abiliity;
import br.eti.gadelha.persistence.model.GenericEntity;
import br.eti.gadelha.persistence.model.akumanomi.AkumanomiClasse;
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
public class Akumanomi extends GenericEntity {

    @Column //@UniqueTitleTutorial
    private String especie;
    @Column
    private AkumanomiClasse classe;
    @Column
    private float preco;
    @Column
    private boolean artificial;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
    @JoinColumn(name = "abiliity")
    private Abiliity abiliity;

    public Akumanomi(String especie, AkumanomiClasse classe, float preco, boolean artificial) {
        this.especie = especie;
        this.classe = classe;
        this.preco = preco;
        this.artificial = artificial;
    }
}