package br.eti.gadelha.persistence.dto.response;

import br.eti.gadelha.persistence.model.Tutorial;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor(access = AccessLevel.PRIVATE)
public class DTOResponseTutorial {

    private String title;
    private String description;
    private boolean published;

    public static DTOResponseTutorial toDTO(Tutorial title) {
        return new DTOResponseTutorial(title.getTitle(), title.getDescription(), title.isPublished());
    }
}