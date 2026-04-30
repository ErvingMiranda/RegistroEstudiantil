package org.UAM.POO.anotacion;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import org.UAM.POO.validator.ValidarNumeroMinimo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = ValidarNumeroMinimo.class)
public @interface NumeroMinimo {
    String message() default "El numero minimo debe ser mayor";
    int minimo() default 0;
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
