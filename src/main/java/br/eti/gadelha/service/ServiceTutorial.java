package br.eti.gadelha.service;

import br.eti.gadelha.persistence.model.Tutorial;
import br.eti.gadelha.persistence.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author	Marcelo Ribeiro Gadelha
 * @mail	gadelha.ti@gmail.com
 * @since	19/06/2020
 * @version 1.0
 * @link	www.gadelha.eti.br
 **/

@Service
public class ServiceTutorial implements GenericDAO<Tutorial, Long> {

    private final TutorialRepository tutorialRepository;

    @Autowired
    public ServiceTutorial(TutorialRepository tutorialRepository) {
        this.tutorialRepository = tutorialRepository;
    }

    public Tutorial create(Tutorial objeto) {
        return tutorialRepository.save(objeto);
    }
    public List<Tutorial> retrieve(){
        return tutorialRepository.findAll();
    }
    public Optional<Tutorial> retrieveOptional(Long id) { return tutorialRepository.findById(id); }
    public Tutorial retrieve(Long id) { return tutorialRepository.getOne(id); }
    public Tutorial update(Tutorial objeto) {
        return tutorialRepository.save(objeto);
    }
    public void delete(Long id) {
        tutorialRepository.deleteById(id);
    }
    public void deleteAll() {
        tutorialRepository.deleteAll();
    }

    public List<Tutorial> titleContaining(String title) { return tutorialRepository.findByTitleContainingIgnoreCaseOrderByTitleAsc(title); }
    public List<Tutorial> findByPublished(Boolean published) { return tutorialRepository.findByPublished(published); }
//    public Optional<List<Tutorial>> findByPublishedOptional(Boolean published) { return tutorialRepository.findByPublishedOptional(published); }
    public boolean isTitleValid(String value) {
        return tutorialRepository.existsByTitle(value);
    }
}