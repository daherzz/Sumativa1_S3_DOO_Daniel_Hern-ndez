package app;
import model.Direccion;     // Se importa la clase Direccion del paquete model
import model.Empleado;      // Se importa la clase Empleado del paquete model
import model.Persona;       // Se importa la clase Persona del paquete model


public class Salmontt {
    
    public static void main(String[] args) {
        
        Direccion direct1 = new Direccion("Las Lengas 931", "Osorno", "Los Lagos");                         // Creación de objeto direct1
        Persona persona1 = new Persona("Marco Diaz", "19232431-1", direct1);                                // Creación de objeto persona1

        System.out.println(persona1);                                                                       // Mostrar datos de persona1

        Direccion direct2 = new Direccion("Av Arturo Pratt 3299", "Puerto Natales", "Magallanes");
        Empleado empleado1 = new Empleado("Pedro Ruiz", "14320065-1", direct2, "Operador Lider", 1000000);  // Creación de objeto empleado1
                                                                                                       
        System.out.println(empleado1);                                                                      // Mostrar datos de empleado1

        Direccion direct3 = new Direccion("Pasaje Los Arrayanes 212", "Castro", "Los Lagos");
        Empleado empleado2 = new Empleado("Angelica Tapia", "20324760-4", direct3, "Operario de fábrica", 600000);

        System.out.println(empleado2);

        Direccion direct4 = new Direccion("Pasaje Los Ulmos 67", "Puerto Montt", "Los Lagos");
        Persona persona2 = new Persona("María Casablanca", "10567033-6", direct4);

        System.out.println(persona2);

    }
    
}
