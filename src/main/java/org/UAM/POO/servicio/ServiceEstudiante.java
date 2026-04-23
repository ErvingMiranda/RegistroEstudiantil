package org.UAM.POO.servicio;

import org.UAM.POO.servicio.IServiceEstudiante;
import org.UAM.POO.exception.RegistroException;
import org.UAM.POO.model.Estudiante;
import org.UAM.POO.persistencia.Global;

public class ServiceEstudiante implements IServiceEstudiante {

    @Override
    public Estudiante getEstudiante(Integer id) throws RegistroException {
        return Global.getInstancia().getTablaEstudiante()
                .stream()
                .filter(estudiante -> estudiante.getId().equals(id))
                .findFirst().orElseThrow(() -> new RegistroException("Estudiante no encontrado"));
    }

    @Override
    public void addEstudiante(Estudiante estudiante) throws RegistroException {

    }


    @Override
    public void removeEstudiante(Integer id) throws RegistroException {

    }

    @Override
    public void updateEstudiante(Estudiante estudiante) throws RegistroException {

    }
}