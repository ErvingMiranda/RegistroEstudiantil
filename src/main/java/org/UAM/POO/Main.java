package org.UAM.POO;

import org.UAM.POO.exception.RegistroException;
import org.UAM.POO.model.Estudiante;
import org.UAM.POO.servicio.IServiceEstudiante;
import org.UAM.POO.servicio.ServiceEstudiante;
import org.UAM.POO.servicio.ServiceValidationEstudiante;
import org.UAM.POO.validator.Procesador;

public class Main {
    public static void main(String[] args) throws RegistroException {
        Estudiante estudiante = new Estudiante(
                "",
                52,
                "Cash",
                "Lopez",
                22323232,
                "norman@gmail.com");
        Procesador.validar(estudiante);
        ServiceValidationEstudiante.validarEstudiante(estudiante);
        IServiceEstudiante s = new ServiceEstudiante();
        s.addEstudiante(estudiante);
    }
}