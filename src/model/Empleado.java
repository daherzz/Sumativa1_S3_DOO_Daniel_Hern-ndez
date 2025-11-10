package model;

public class Empleado extends Persona{
    /**
     * Clase que representa a un empleado (Cargo y sueldo, además hereda los atributos de la clase Persona) dentro del paquete model
     */

    private String cargo;    // Atributo privado que está en Empleado y no en Persona
    private int sueldo;      // Atributo privado que está en Empleado y no en Persona

    public Empleado(){
    }

    public Empleado(String nombre, String rut, Direccion direccion, String cargo, int sueldo) {
        super(nombre, rut, direccion);      // super() llama al constructor de la clase padre (Persona) para inicializar los atributos heredados
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString() +
                " es Empleado{" +
                "cargo='" + cargo + '\'' +
                ", sueldo=" + sueldo;
    }
    
}
