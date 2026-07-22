package Vista;

import Controlador.controlador_chofer;
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
}
