package br.eti.gadelha.persistence.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;

@Entity @Data @AllArgsConstructor
public class Book extends GenericEntity {
    private String name;
    private Integer chapter;
    private Integer pages;
}