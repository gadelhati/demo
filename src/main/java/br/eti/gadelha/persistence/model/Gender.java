package br.eti.gadelha.persistence.model;

import lombok.Getter;

/**
 * @author	Marcelo Ribeiro Gadelha
 * @mail	marcelo.gadelha@marinha.mil.br
 * @link	www.gadelha.eti.br
 **/

@Getter
public enum Gender {
    MALE("Male"),
    FEMALE("Female");

    String gender;

    private Gender(String gender) {
        this.gender = gender;
    }
    public String getRole() {
        return this.gender;
    }
}