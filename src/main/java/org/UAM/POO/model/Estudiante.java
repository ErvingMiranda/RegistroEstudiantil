package org.UAM.POO.model;

import org.UAM.POO.anotacion.CadenaVacia;
import org.UAM.POO.anotacion.NumeroMinimo;

public class Estudiante extends Identity{
    @CadenaVacia(min = 0, message = "El nombre no puede estar vacío")
    private String nombre;
    @CadenaVacia(min = 0, message = "El apellido no puede estar vacío")
    private String apellido;
    @NumeroMinimo(minimo = 18, message = "Solo mayores de edad")
    private Integer edad;
    @CadenaVacia(min = 0, message = "La direccion no puede ser cero")
    private String direccion;
    private Integer telefono;
    private String email;

    public Estudiante() {
        super();
    }

    public Estudiante(String nombre, Integer edad, String apellido, String direccion, Integer telefono, String email) {
        super();
        this.nombre = nombre;
        this.edad = edad;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", direccion='" + direccion + '\'' +
                ", telefono=" + telefono +
                ", email='" + email + '\'' +
                '}';
    }
}