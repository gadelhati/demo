package br.eti.gadelha.persistence.model;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import java.time.LocalDateTime;

@Data @Embeddable
public class Audit {
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
    @PrePersist
    public void prePersist() {
        this.createAt = LocalDateTime.now();
    }
    @PostUpdate
    public void postPersist() {
        this.updateAt = LocalDateTime.now();
    }
}