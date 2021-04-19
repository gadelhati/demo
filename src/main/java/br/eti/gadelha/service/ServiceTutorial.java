package br.eti.gadelha.service;

import br.eti.gadelha.persistence.model.Tutorial;
import br.eti.gadelha.persistence.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * @author	Marcelo Ribeiro Gadelha
 * @mail	marcelo.gadelha@marinha.mil.br
 * @since	19/06/2020
 * @version 1.0
 * @link	www.gadelha.eti.br
 **/

@Service
public class ServiceTutorial implements GenericDAO<Tutorial, Long> {

    @Autowired
    private TutorialRepository tutorialRepository;

    public Tutorial create(Tutorial objeto) {
        return tutorialRepository.save(objeto);
    }
    public List<Tutorial> retrieve(){
        return tutorialRepository.findAll();
    }
    public Optional<Tutorial> retrieve(Long id) { return tutorialRepository.findById(id); }
    public Tutorial retrieveOne(Long id) { return tutorialRepository.getOne(id); }
    public Tutorial update(Tutorial objeto) {
        return tutorialRepository.save(objeto);
    }
    public void delete(Long id) {
        tutorialRepository.deleteById(id);
    }
}