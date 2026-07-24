package Vista;

import java.util.Scanner;

public class vista_motor {
    
    public String tomar_nserie (){
        System.out.println("Ingrese el número de serie del motor:");
        Scanner teclado = new Scanner (System.in);
        String nserie = teclado.next();
        return nserie;
    }
    
    public String tomar_tipo (){
        System.out.println("Ingrese el tipo de motor:");
        Scanner teclado = new Scanner (System.in);
        String tipo = teclado.next();
        return tipo;
    }
    
    public void mostrar_datos(String nserie, String tipo) {
        System.out.println("\n--- DATOS DEL MOTOR REGISTRADO ---");
        System.out.println("Número de Serie: " + nserie);
        System.out.println("Tipo de Motor: " + tipo + "\n");
    }

    public void mostrar_error_nserie_vacio() {
        System.out.println("Error: El número de serie del motor no puede estar vacío.");
    }

    public void mostrar_error_tipo_vacio() {
        System.out.println("Error: El tipo de motor no puede estar vacío.");
    }
}
