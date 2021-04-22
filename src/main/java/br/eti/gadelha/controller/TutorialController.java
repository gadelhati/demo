package br.eti.gadelha.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import br.eti.gadelha.persistence.model.Tutorial;
import br.eti.gadelha.persistence.repository.TutorialRepository;
import br.eti.gadelha.service.ServiceTutorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author	Marcelo Ribeiro Gadelha
 * @mail	gadelha.ti@gmail.com
 * @since	19/06/2020
 * @version 1.0
 * @link	www.gadelha.eti.br
 **/

@CrossOrigin(origins = "http://localhost:8080")
@RestController
//@RequestMapping("/api")
public class TutorialController {

    public final ServiceTutorial serviceTutorial;

    @Autowired
    private TutorialController(ServiceTutorial serviceTutorial) {
        this.serviceTutorial = serviceTutorial;
    }
    //FALTANDO
    @GetMapping("/tutorial") //@PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    public ResponseEntity<List<Tutorial>> retrieveAll(@RequestParam(required = false) String title) {
        try {
            List<Tutorial> tutorials = new ArrayList<>();
            if (title == null)
                serviceTutorial.retrieve().forEach(tutorials::add);
            else
                serviceTutorial.titleContaining(title).forEach(tutorials::add);
            if (tutorials.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(tutorials, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/tutorial/{id}")
    public ResponseEntity<Tutorial> retrieve(@PathVariable("id") long id) {
        Optional<Tutorial> tutorial = serviceTutorial.retrieveOptional(id);
        if (tutorial.isPresent()) {
            return new ResponseEntity<>(tutorial.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/tutorial")
    public ResponseEntity<Tutorial> create(@RequestBody @Valid Tutorial tutorial) {
        try {
            Tutorial tutorial1 = serviceTutorial.create(tutorial);
            return new ResponseEntity<>(tutorial1, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/tutorial/{id}")
    public ResponseEntity<HttpStatus> update(@PathVariable("id") long id, @RequestBody @Valid Tutorial tutorial) {
        Optional<Tutorial> busca = serviceTutorial.retrieveOptional(id);
        if (busca.isPresent()) {
            serviceTutorial.create(busca.get());
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/tutorial/{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable("id") long id) {
        Optional<Tutorial> tutorial = serviceTutorial.retrieveOptional(id);
        if (tutorial.isPresent()) {
            serviceTutorial.delete(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/tutorial")
    public ResponseEntity<HttpStatus> deleteAll() {
        try {
            serviceTutorial.deleteAll();
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    //FALTANDO
    @GetMapping("/tutorial/published")
    public ResponseEntity<List<Tutorial>> findByPublished() {
        try {
            List<Tutorial> tutorials = serviceTutorial.findByPublished(true);
            if (tutorials.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(tutorials, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}