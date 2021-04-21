package br.eti.gadelha.persistence.dto.request;

import br.eti.gadelha.exception.annotation.UniqueTitleTutorial;
import br.eti.gadelha.persistence.model.Tutorial;
import lombok.Getter;

import javax.persistence.Column;

@Getter
public class DTORequestTutorial {

    @Column @UniqueTitleTutorial
    private String title;
    @Column
    private String description;
    @Column
    private boolean published;

    public Tutorial toObject(){
        return new Tutorial(title, description, published);
    }
}