package org.UAM.POO;

import org.UAM.POO.exception.RegistroException;
import org.UAM.POO.model.Estudiante;
import org.UAM.POO.servicio.IServiceEstudiante;
import org.UAM.POO.servicio.ServiceEstudiante;
import org.UAM.POO.servicio.ServiceValidationEstudiante;

public class Main {
    public static void main(String[] args) {
        try {
            Estudiante estudiante = new Estudiante("Norman", 52, "Cash", "Lopez", 22323232, "norman@gmail.com");

            ServiceValidationEstudiante.validarEstudiante(estudiante);

            IServiceEstudiante s = new ServiceEstudiante();
            s.addEstudiante(estudiante);

            System.out.println("Estudiante registrado correctamente.");
            System.out.println(estudiante);

        } catch (RegistroException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}