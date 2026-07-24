package Vista;

import java.util.Scanner;

public class vista_pasajero {
    
    public String tomar_cedula (){
        System.out.println("Ingrese la cédula del pasajero:");
        Scanner teclado = new Scanner (System.in);
        String cedula = teclado.next();
        return cedula;
    }
    
    public String tomar_nombre (){
        System.out.println("Ingrese el nombre del pasajero:");
        Scanner teclado = new Scanner (System.in);
        String nombre = teclado.next();
        return nombre;
    }
    
    public void mostrar_datos(String cedula, String nombre) {
        System.out.println("\n--- DATOS DEL PASAJERO REGISTRADO ---");
        System.out.println("Cédula: " + cedula);
        System.out.println("Nombre: " + nombre + "\n");
    }

    public void mostrar_error_cedula_vacia() {
        System.out.println("Error: La cédula del pasajero no puede estar vacía.");
    }

    public void mostrar_error_nombre_vacio() {
        System.out.println("Error: El nombre del pasajero no puede estar vacío.");
    }

    public void mostrar_error_cedula_formato() {
        System.out.println("Error: La cédula del pasajero solo debe contener números.");
    }

    public void mostrar_error_nombre_formato() {
        System.out.println("Error: El nombre del pasajero no puede contener números ni caracteres especiales.");
    }
}
