package br.eti.gadelha.exception.validator;

import br.eti.gadelha.exception.annotation.UniqueNameTutorial;
import br.eti.gadelha.service.ServiceTutorial;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniqueNameTutorialValidator implements ConstraintValidator<UniqueNameTutorial, String> {

    @Autowired
    private ServiceTutorial serviceTutorial;

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        System.out.println(value);
        if(value != null) {
            if(serviceTutorial.isTitleValid(value)) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
//        return value != null && !serviceOM.isNameValid(value);
    }
}