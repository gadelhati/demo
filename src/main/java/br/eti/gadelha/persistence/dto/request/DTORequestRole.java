package br.eti.gadelha.persistence.dto.request;

import br.eti.gadelha.exception.annotation.UniqueRoleName;
import br.eti.gadelha.persistence.model.Role;
import lombok.Getter;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
public class DTORequestRole {

    @NotNull(message = "{name.not.null}") @NotBlank(message = "{name.not.blank}") @UniqueRoleName
    private String name;

    public Role toObject(){
        return new Role(name);
    }
}