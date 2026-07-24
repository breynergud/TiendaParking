package Controlador;

import Modelo.MotorModelo;
import Vista.vista_motor;

public class controlador_motor {
    public vista_motor obj_vista;
    public controlador_motor (vista_motor obj_vista){
        this.obj_vista = obj_vista;
    }
    
    public MotorModelo procesar_datos(){
        MotorModelo obj_motor;
        do {
            String dato_nserie = this.obj_vista.tomar_nserie();
            String dato_tipo = this.obj_vista.tomar_tipo();
            obj_motor = new MotorModelo (dato_nserie, dato_tipo);
        } while (!obj_motor.validarMotor(this.obj_vista));
        
        // La vista muestra los datos ingresados
        this.obj_vista.mostrar_datos(obj_motor.getNserie_motor(), obj_motor.getTipo_motor());
        
        return obj_motor;
    }
}
