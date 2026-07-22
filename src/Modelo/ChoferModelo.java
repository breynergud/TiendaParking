
package Modelo;

public class ChoferModelo {

    private String nombre_chofer = "";
    String licencia_chofer = "";
    String cedula_chofer = "";

    public ChoferModelo(String dato_nombre, String dato_licencia, String dato_cedula) {
        this.nombre_chofer = dato_nombre;
        this.licencia_chofer = dato_licencia;
        this.cedula_chofer = dato_cedula;
    }

    public String getNombre_chofer() {
        return nombre_chofer;
    }

    public void setNombre_chofer(String nombre_chofer) {
        this.nombre_chofer = nombre_chofer;
    }

    public String getLicencia_chofer() {
        return licencia_chofer;
    }

    public void setLicencia_chofer(String licencia_chofer) {
        this.licencia_chofer = licencia_chofer;
    }

    public String getCedula_chofer() {
        return cedula_chofer;
    }

    public void setCedula_chofer(String cedula_chofer) {
        this.cedula_chofer = cedula_chofer;
    }

    // Reglas de negocio del Chofer
    public boolean validarChofer() {
        // 1. Ningún campo puede estar vacío o nulo
        if (nombre_chofer == null || nombre_chofer.trim().equals("")) {
            System.out.println("Error: El nombre del chofer no puede estar vacío.");
            return false;
        }
        if (licencia_chofer == null || licencia_chofer.trim().equals("")) {
            System.out.println("Error: La licencia del chofer no puede estar vacía.");
            return false;
        }
        if (cedula_chofer == null || cedula_chofer.trim().equals("")) {
            System.out.println("Error: La cédula del chofer no puede estar vacía.");
            return false;
        }

        // 2. Nombre: solo letras y espacios (sin caracteres especiales ni números)
        if (!nombre_chofer.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+$")) {
            System.out.println("Error: El nombre del chofer no puede contener números ni caracteres especiales.");
            return false;
        }

        // 3. Licencia: exactamente 2 caracteres (1er caracter letra, 2do caracter número)
        if (!licencia_chofer.matches("^[a-zA-Z][0-9]$")) {
            System.out.println("Error: La licencia debe tener exactamente 2 caracteres (primer carácter una letra y segundo un número, ej: A1).");
            return false;
        }

        // 4. Cédula: solo números (sin puntos, comas, guiones ni espacios)
        if (!cedula_chofer.matches("^[0-9]+$")) {
            System.out.println("Error: La cédula solo debe contener números (sin puntos, comas ni espacios).");
            return false;
        }

        return true;
    }
}
