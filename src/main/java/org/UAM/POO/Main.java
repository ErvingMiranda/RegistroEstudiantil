package org.UAM.POO;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import org.UAM.POO.exception.RegistroException;
import org.UAM.POO.model.Estudiante;
import org.UAM.POO.servicio.IServiceEstudiante;
import org.UAM.POO.servicio.ServiceEstudiante;
import org.UAM.POO.servicio.ServiceValidationEstudiante;
import org.UAM.POO.validator.Procesador;

import java.util.Set;

public class Main {
    public static void main(String[] args) throws RegistroException {
        Estudiante estudiante = new Estudiante(
                "Nombre",
                12,
                "Cash",
                "SuCasa",
                22323232,
                "norman@gmail.com");
        Procesador.validar(estudiante);

        Validator validator = Validation
                .buildDefaultValidatorFactory().getValidator();
        Set<ConstraintViolation<Estudiante>> violations = validator
                .validate(estudiante);
        for (ConstraintViolation<Estudiante> violation : violations) {
            System.out.println(violation.getMessage());
        }

        ServiceValidationEstudiante.validarEstudiante(estudiante);
        IServiceEstudiante s = new ServiceEstudiante();
        s.addEstudiante(estudiante);
    }
}