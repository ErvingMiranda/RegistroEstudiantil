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
        Global.getInstancia().getTablaEstudiante().add(estudiante);
    }


    @Override
    public void removeEstudiante(Estudiante estudiante) throws RegistroException {
        Global.getInstancia().getTablaEstudiante().remove(estudiante);
    }

    @Override
    public void updateEstudiante(Estudiante estudiante) throws RegistroException {
        Estudiante e = Global.getInstancia().getTablaEstudiante()
                .stream().filter(dato -> dato.getId().equals(estudiante.getId()))
                .findFirst().orElse(null);
        if (e != null) {
            e.setNombre(estudiante.getNombre());
            e.setApellido(estudiante.getApellido());
            e.setDireccion(estudiante.getDireccion());
            e.setTelefono(estudiante.getTelefono());
            e.setEmail(estudiante.getEmail());
        }
    }
}