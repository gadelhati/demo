package br.eti.gadelha.controller;

import br.eti.gadelha.persistence.model.Tutorial;
import br.eti.gadelha.service.ServiceTutorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.util.UUID;

/**
 * @author	Marcelo Ribeiro Gadelha
 * @mail	gadelha.ti@gmail.com
 * @since	18/06/2020
 * @version	3.0
 * @link	www.gadelha.eti.br
 **/

@Controller
@RequestMapping(value= "/tutorialMV")
public class TutorialControllerThymeleaf {

    @Autowired
    private ServiceTutorial serviceTutorial;
    RestTemplate restTemplate = new RestTemplate();

    @PostMapping("/create")
    public ModelAndView create(@Valid Tutorial tutorial, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return add(tutorial);
        }
        serviceTutorial.create(tutorial);
        return findAll();
    }
    @GetMapping("/retrieve")
    public ModelAndView findAll() {
        return new ModelAndView("/tutorial").addObject("tutorials", serviceTutorial.retrieve());
    }
    @GetMapping("/update/{id}")
    public ModelAndView update(@PathVariable("id") Long id) {
        return add(serviceTutorial.retrieveOne(id));
    }
    @GetMapping("/add")
    public ModelAndView add(Tutorial tutorial) {
        return new ModelAndView("/tutorialADD").addObject("tutorial", tutorial);
    }
    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id") @NotBlank UUID id) {
        Tutorial objeto = restTemplate.getForObject("http://localhost:8119/tutorial/delete/" + id, Tutorial.class);
        return findAll();
    }
}