package org.UAM.POO.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.UAM.POO.anotacion.NumeroMinimo;

public class ValidarNumeroMinimo implements
        ConstraintValidator<NumeroMinimo, Integer> {

    private int minimo;

    @Override
    public void initialize(NumeroMinimo anotation) {
        this.minimo = anotation.minimo();
    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        if (value < minimo) {
            return false;
        }
        return true;
    }
}
