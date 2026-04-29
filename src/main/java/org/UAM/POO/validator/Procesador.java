package org.UAM.POO.validator;

import org.UAM.POO.anotacion.CadenaVacia;
import org.UAM.POO.exception.RegistroException;

import java.lang.reflect.Field;

public class Procesador {
    public static void validar(Object obj) {
        for (Field f : obj.getClass().getDeclaredFields()) {
            if (f.isAnnotationPresent(CadenaVacia.class)){
                CadenaVacia c = f.getAnnotation(CadenaVacia.class);
                f.setAccessible(true);
                try{
                    Object valor = f.get(obj);
                    if (valor instanceof String str){
                        if (str.length() == c.min()){
                            throw new RuntimeException(c.message());
                        }
                    }
                }
                catch (IllegalArgumentException | IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}