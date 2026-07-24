package Modelo;

import Vista.vista_chofer;

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
    public boolean validarChofer(vista_chofer obj_vista) {
        if (nombre_chofer == null || nombre_chofer.trim().equals("")) {
            obj_vista.mostrar_error_nombre_vacio();
            return false;
        }
        if (licencia_chofer == null || licencia_chofer.trim().equals("")) {
            obj_vista.mostrar_error_licencia_vacia();
            return false;
        }
        if (cedula_chofer == null || cedula_chofer.trim().equals("")) {
            obj_vista.mostrar_error_cedula_vacia();
            return false;
        }

        if (!nombre_chofer.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+$")) {
            obj_vista.mostrar_error_nombre_formato();
            return false;
        }

        if (!licencia_chofer.matches("^[a-zA-Z][0-9]$")) {
            obj_vista.mostrar_error_licencia_formato();
            return false;
        }

        if (!cedula_chofer.matches("^[0-9]+$")) {
            obj_vista.mostrar_error_cedula_formato();
            return false;
        }

        return true;
    }
}
