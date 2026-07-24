package Modelo;

import Vista.vista_pasajero;

public class PasajeroModelo {

    String cedula_pasajero = "";
    String nombre_pasajero = "";

    public PasajeroModelo(String dato_cedula, String dato_nombre) {
        this.cedula_pasajero = dato_cedula;
        this.nombre_pasajero = dato_nombre;
    }

    public String getCedula_pasajero() {
        return cedula_pasajero;
    }

    public void setCedula_pasajero(String cedula_pasajero) {
        this.cedula_pasajero = cedula_pasajero;
    }

    public String getNombre_pasajero() {
        return nombre_pasajero;
    }

    public void setNombre_pasajero(String nombre_pasajero) {
        this.nombre_pasajero = nombre_pasajero;
    }

    // Reglas de negocio del Pasajero
    public boolean validarPasajero(vista_pasajero obj_vista) {
        if (cedula_pasajero == null || cedula_pasajero.trim().equals("")) {
            obj_vista.mostrar_error_cedula_vacia();
            return false;
        }
        if (nombre_pasajero == null || nombre_pasajero.trim().equals("")) {
            obj_vista.mostrar_error_nombre_vacio();
            return false;
        }

        if (!cedula_pasajero.matches("^[0-9]+$")) {
            obj_vista.mostrar_error_cedula_formato();
            return false;
        }

        if (!nombre_pasajero.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+$")) {
            obj_vista.mostrar_error_nombre_formato();
            return false;
        }

        return true;
    }
}
