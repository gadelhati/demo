package br.eti.gadelha.persistence.dto.response;

import br.eti.gadelha.persistence.model.Role;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor(access = AccessLevel.PRIVATE)
public class DTOResponseRole {

    private String name;

    public static DTOResponseRole toDTO(Role role) {
        return new DTOResponseRole(role.getName());
    }
}