package br.eti.gadelha.persistence.repository;

import br.eti.gadelha.persistence.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author	Marcelo Ribeiro Gadelha
 * @mail	gadelha.ti@gmail.com
 * @since	19/06/2020
 * @version 1.0
 * @link	www.gadelha.eti.br
 **/

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
    List<Tutorial> findByPublished(boolean published);
//    Optional<List<Tutorial>> findByPublishedOptional(boolean published);
    List<Tutorial> findByTitleContainingIgnoreCaseOrderByTitleAsc(String title);
//    Optional<List<Tutorial>> findAllTitleContainingIgnoreCaseOrderByTitleAsc();
    List<Tutorial> findAllByOrderByTitleDesc();
    boolean existsByTitle(String title);
}