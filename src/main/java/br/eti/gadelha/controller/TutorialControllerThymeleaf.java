package br.eti.gadelha.controller;

import br.eti.gadelha.persistence.dto.request.DTORequestTutorial;
import br.eti.gadelha.persistence.model.Tutorial;
import br.eti.gadelha.service.ServiceTutorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

/**
 * @author	Marcelo Ribeiro Gadelha
 * @mail	gadelha.ti@gmail.com
 * @since	18/06/2020
 * @version	3.0
 * @link	www.gadelha.eti.br
 **/

@RestController
@RequestMapping(value= "/tutorialMV")
@CrossOrigin(origins = "*", maxAge = 3600)
public class TutorialControllerThymeleaf {

    private final ServiceTutorial serviceTutorial;

    @Autowired
    public TutorialControllerThymeleaf(ServiceTutorial serviceTutorial) {
        this.serviceTutorial = serviceTutorial;
    }

    @PostMapping("/create")
    public ModelAndView create(@Valid Tutorial tutorial, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return add(tutorial);
        }
        serviceTutorial.create(tutorial);
        return findAll();
    }
    @PostMapping("/createDTO")
    public ModelAndView create(@Valid DTORequestTutorial tutorial, BindingResult bindingResult) {
        Tutorial tutorial1 = serviceTutorial.create(tutorial.toObject());
        if(bindingResult.hasErrors()) {
            return add(tutorial1);
        }
        return findAll();
    }
    @GetMapping("/retrieve")
    public ModelAndView findAll() {
        return new ModelAndView("tutorial").addObject("tutorials", serviceTutorial.retrieve());
    }
    @GetMapping("/update/{id}")
    public ModelAndView update(@PathVariable("id") Long id) {
        return add(serviceTutorial.retrieve(id));
    }
    @GetMapping("/add")
    public ModelAndView add(Tutorial tutorial) {
        return new ModelAndView("tutorialADD").addObject("tutorial", tutorial);
    }
    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id") @NotBlank Long id) {
        if(serviceTutorial.retrieve(id) != null) {
            serviceTutorial.delete(id);
        }
        return findAll();
    }
}