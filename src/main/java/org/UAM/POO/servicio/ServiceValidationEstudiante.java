package org.UAM.POO.servicio;

import org.UAM.POO.exception.RegistroException;
import org.UAM.POO.model.Estudiante;

import java.util.regex.Pattern;

public class ServiceValidationEstudiante {
    public static void validarEstudiante(Estudiante estudiante) throws RegistroException {
        final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        final Pattern pattern = Pattern.compile(EMAIL_REGEX);

        if  (estudiante.getNombre().isEmpty() || estudiante.getNombre().isBlank()) {
            throw new RegistroException("El nombre es requerido");
        }
        if (estudiante.getApellido().isEmpty() || estudiante.getApellido().isBlank()) {
            throw new RegistroException("El apellido es requerido");
        }
        if (estudiante.getEdad() < 0) {
            throw new RegistroException("La edad debe ser mayor a 0");
        }
        if (pattern.matcher(estudiante.getEmail()).matches()) {
            throw new RegistroException("El email no tiene el formato correcto");
        }
    }
}
