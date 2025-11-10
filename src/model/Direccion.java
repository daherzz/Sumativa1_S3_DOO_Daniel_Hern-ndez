package model;

public class Direccion {
        /**
     * Clase que representa una dirección (Calle, ciudad y región) dentro del paquete model
     */

    private String calle, ciudad, region;                           // Atributos privados que guardan datos de la dirección

    public Direccion() {                                            // Constructor vacío
    }

    public Direccion(String calle, String ciudad, String region) {  // Constructor con parámetros
        this.calle = calle;                                         // this indica que el atributo de la clase recibe el valor del parámetro que viene desde el método.
        this.ciudad = ciudad;
        this.region = region;
    }

    public String getCalle() {                                      // Metodo get devuelve el valor actual del atributo
        return calle;
    }

    public void setCalle(String calle) {                            // Metodo set permite modificar el atributo y asignarle un nuevo valor
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

        @Override
    public String toString() {                                  // Método toString define cómo se mostrará el objeto en pantalla cuando se use System.out.println()
        return "Direccion{" +
                "calle='" + calle + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", region='" + region + '\'' +
                '}';
    }
    
}
