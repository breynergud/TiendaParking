package Controlador;

import Modelo.PasajeroModelo;
import Vista.vista_pasajero;

public class controlador_pasajero {
    public vista_pasajero obj_vista;
    public controlador_pasajero (vista_pasajero obj_vista){
        this.obj_vista = obj_vista;
    }
    
    public PasajeroModelo procesar_datos(){
        PasajeroModelo obj_pasajero;
        do {
            String dato_cedula = this.obj_vista.tomar_cedula();
            String dato_nombre = this.obj_vista.tomar_nombre();
            obj_pasajero = new PasajeroModelo (dato_cedula, dato_nombre);
        } while (!obj_pasajero.validarPasajero(this.obj_vista));
        
        // La vista muestra los datos ingresados
        this.obj_vista.mostrar_datos(obj_pasajero.getCedula_pasajero(), obj_pasajero.getNombre_pasajero());
        
        return obj_pasajero;
    }
}
