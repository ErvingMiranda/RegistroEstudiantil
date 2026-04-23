package org.UAM.POO.persistencia;

import org.UAM.POO.model.Estudiante;
import java.util.ArrayList;
import java.util.List;

public class Global {
    private static Global instancia;
    private static List<Estudiante> tablaEstudiante = new ArrayList<Estudiante>();

    private Global () {}

    public static Global getInstancia(){
        if (instancia==null){
            instancia = new Global();
        }
        return instancia;
    }

    public List<Estudiante> getTablaEstudiante() {
        return tablaEstudiante;
    }
}
