package br.eti.gadelha.persistence.repository;

import br.eti.gadelha.persistence.model.Role;
import br.eti.gadelha.persistence.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * @author	Marcelo Ribeiro Gadelha
 * @mail	marcelo.gadelha@marinha.mil.br
 * @link	www.gadelha.eti.br
 **/

@Repository
public interface RepositoryRole extends JpaRepository<Role, UUID> {
    //QUERIES PERSONALIZADAS
    Optional<Role> findByName(String name);
    boolean existsByName(String name);
    List<Role> findByNameContainingIgnoreCaseOrderByNameAsc(String name);
}