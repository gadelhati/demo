package br.eti.gadelha.exception.validator;

import br.eti.gadelha.exception.annotation.UniqueTitleTutorial;
import br.eti.gadelha.service.ServiceTutorial;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniqueTitleTutorialValidator implements ConstraintValidator<UniqueTitleTutorial, String> {

    @Autowired
    private ServiceTutorial serviceTutorial;

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value != null && !serviceTutorial.isTitleValid(value);
    }
}