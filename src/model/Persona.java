package model;

public class Persona {
        /**
     * Clase que representa a una persona (Nombre, RUT y dirección), compuesta por la clase Direccion, dentro del paquete model
     */

    private String nombre, rut;     // Atributos privados que guardan el nombre y rut de la persona
    private Direccion direccion;    // Atributo privado que es representa un objeto de tipo Direccion

    public Persona() {
    }

    public Persona(String nombre, String rut, Direccion direccion) {
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", rut='" + rut + '\'' +
                ", direccion=" + direccion +
                '}';
    }
    
}
