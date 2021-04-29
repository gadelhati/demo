package br.eti.gadelha.exception.validator;

import br.eti.gadelha.exception.annotation.UniqueRoleName;
import br.eti.gadelha.service.ServiceRole;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniqueRoleNameValidator implements ConstraintValidator<UniqueRoleName, String> {

    @Autowired
    private ServiceRole serviceRole;

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value != null && !serviceRole.isNameValid(value);
    }
}