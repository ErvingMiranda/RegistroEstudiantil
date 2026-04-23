package org.UAM.POO.servicio;

import org.UAM.POO.exception.RegistroException;
import org.UAM.POO.model.Estudiante;

public interface IServiceEstudiante {
    Estudiante getEstudiante(Integer id) throws RegistroException;
    void addEstudiante(Estudiante estudiante) throws RegistroException;
    void removeEstudiante(Integer id) throws RegistroException;
    void updateEstudiante(Estudiante estudiante) throws RegistroException;
}
