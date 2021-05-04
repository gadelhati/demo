package br.eti.gadelha.persistence.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import java.util.Date;

@Entity @Data @AllArgsConstructor
public class User extends GenericEntity {
    private String name;
    private Date birthdate;
}
