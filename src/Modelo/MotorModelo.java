package Modelo;

import Vista.vista_motor;

public class MotorModelo {

    String nserie_motor = "";
    String tipo_motor = "";

    public MotorModelo(String dato_nserie, String dato_tipo) {
        this.nserie_motor = dato_nserie;
        this.tipo_motor = dato_tipo;
    }

    public boolean validarMotor(vista_motor obj_vista) {
        if (nserie_motor == null || nserie_motor.trim().equals("")) {
            obj_vista.mostrar_error_nserie_vacio();
            return false;
        }
        if (tipo_motor == null || tipo_motor.trim().equals("")) {
            obj_vista.mostrar_error_tipo_vacio();
            return false;
        }
        return true;
    }

    public boolean esEcologico() {
        if (tipo_motor.equalsIgnoreCase("Electrico") || tipo_motor.equalsIgnoreCase("Hibrido")) {
            return true;
        } else {
            return false;
        }
    }

    public String getNserie_motor() {
        return nserie_motor;
    }

    public void setNserie_motor(String nserie_motor) {
        this.nserie_motor = nserie_motor;
    }

    public String getTipo_motor() {
        return tipo_motor;
    }

    public void setTipo_motor(String tipo_motor) {
        this.tipo_motor = tipo_motor;
    }
}
