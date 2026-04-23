package org.UAM.POO.util;

import java.util.ArrayList;

public class Global {
    private static Global instancia;
    //static List<T> DB = new ArrayList<T>();

    private Global () {}

    public static Global getInstancia(){
        if (instancia==null){
            instancia = new Global();
        }
        return instancia;
    }
}
