package br.com.contmatic.empresa.util;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.Set;
import com.google.common.base.Preconditions;

public class Validation {

    Validator validator = javax.validation.Validation.buildDefaultValidatorFactory().getValidator();
    Set<ConstraintViolation<Object>> violations;

    public boolean validate(Object o) {
        violations = validator.validate(o);
        for (ConstraintViolation<Object> violation : violations) {
            System.err.println(violation.getPropertyPath() + " " + violation.getMessage());
        }
        Preconditions.checkArgument(violations.isEmpty(), "A validação encontrou: " + violations.size() + " erros" );
        return true;
    }
}
