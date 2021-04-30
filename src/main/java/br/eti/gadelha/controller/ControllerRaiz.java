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
import java.util.UUID;

/**
 * @author	Marcelo Ribeiro Gadelha
 * @mail	gadelha.ti@gmail.com
 * @since	30/04/2021
 * @version	2.0
 * @link	www.gadelha.eti.br
 **/

@RestController
@RequestMapping(value= "/")
@CrossOrigin(origins = "*", maxAge = 3600)
public class ControllerRaiz {

    private final ServiceTutorial serviceTutorial;

    @Autowired
    public ControllerRaiz(ServiceTutorial serviceTutorial) {
        this.serviceTutorial = serviceTutorial;
    }

    @GetMapping
    public ModelAndView findAll() {
        return new ModelAndView("tutorial").addObject("tutorials", serviceTutorial.retrieve());
    }
}