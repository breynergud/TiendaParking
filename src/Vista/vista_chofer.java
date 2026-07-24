package Vista;

import java.util.Scanner;

public class vista_chofer {
    
    public String tomar_nombre (){
        System.out.println("Ingrese el nombre del chofer:");
        Scanner teclado = new Scanner (System.in);
        String nombre = teclado.next();
        return nombre;
    }
    
    public String tomar_licencia (){
        System.out.println("Ingrese la licencia del chofer:");
        Scanner teclado = new Scanner (System.in);
        String licencia = teclado.next();
        return licencia;
    }
    
    public String tomar_cedula (){
        System.out.println("Ingrese la cédula del chofer:");
        Scanner teclado = new Scanner (System.in);
        String cedula = teclado.next();
        return cedula;
    }
    
    public void mostrar_datos(String nombre, String licencia, String cedula) {
        System.out.println("\n--- DATOS DEL CHOFER REGISTRADO ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Licencia: " + licencia);
        System.out.println("Cédula: " + cedula + "\n");
    }

    public void mostrar_error_nombre_vacio() {
        System.out.println("Error: El nombre del chofer no puede estar vacío.");
    }

    public void mostrar_error_licencia_vacia() {
        System.out.println("Error: La licencia del chofer no puede estar vacía.");
    }

    public void mostrar_error_cedula_vacia() {
        System.out.println("Error: La cédula del chofer no puede estar vacía.");
    }

    public void mostrar_error_nombre_formato() {
        System.out.println("Error: El nombre del chofer no puede contener números ni caracteres especiales.");
    }

    public void mostrar_error_licencia_formato() {
        System.out.println("Error: La licencia debe tener exactamente 2 caracteres (primer carácter una letra y segundo un número, ej: A1).");
    }

    public void mostrar_error_cedula_formato() {
        System.out.println("Error: La cédula solo debe contener números (sin puntos, comas ni espacios).");
    }
}
