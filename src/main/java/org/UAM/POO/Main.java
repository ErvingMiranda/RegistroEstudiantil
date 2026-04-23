package org.UAM.POO;

import org.UAM.POO.exception.RegistroException;
import org.UAM.POO.model.Estudiante;
import org.UAM.POO.servicio.IServiceEstudiante;
import org.UAM.POO.servicio.ServiceEstudiante;
import org.UAM.POO.servicio.ServiceValidationEstudiante;

public class Main {
    public static void main(String[] args) throws RegistroException {
        Estudiante estudiante = new Estudiante("Norman", 52, "Cash", "", 22323232, "norman@gmail.com");
        ServiceValidationEstudiante.validarEstudiante(estudiante);
        IServiceEstudiante s = new ServiceEstudiante();
        s.addEstudiante(estudiante);
        System.out.println(s);
    }
}