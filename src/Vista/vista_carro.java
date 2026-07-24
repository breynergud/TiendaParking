package Vista;

import java.util.Scanner;

public class vista_carro {

    public String tomar_marca() {
        System.out.println("Ingrese la marca del carro:");
        Scanner teclado = new Scanner(System.in);
        String marca = teclado.next();
        return marca;
    }

    public String tomar_color() {
        System.out.println("Ingrese el color del carro:");
        Scanner teclado = new Scanner(System.in);
        String color = teclado.next();
        return color;
    }

    public String tomar_placa() {
        System.out.println("Ingrese la placa del carro:");
        Scanner teclado = new Scanner(System.in);
        String placa = teclado.next();
        return placa;
    }

    public void mostrar_datos(String marca, String color, String placa) {
        System.out.println("\n--- DATOS DEL CARRO REGISTRADO ---");
        System.out.println("Marca: " + marca);
        System.out.println("Color: " + color);
        System.out.println("Placa: " + placa + "\n");
    }

    public void mostrar_error_marca_vacia() {
        System.out.println("Error: La marca del carro no puede estar vacía.");
    }

    public void mostrar_error_color_vacio() {
        System.out.println("Error: El color del carro no puede estar vacío.");
    }

    public void mostrar_error_placa_vacia() {
        System.out.println("Error: La placa del carro no puede estar vacía.");
    }

    public void mostrar_placa_encontrada(String marca) {
        System.out.println("¡Placa encontrada! Corresponde a la marca: " + marca);
    }

    public void mostrar_placa_no_coincide() {
        System.out.println("La placa no coincide con este carro.");
    }
}
