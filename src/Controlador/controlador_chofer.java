package Controlador;

import Modelo.ChoferModelo;
import Vista.vista_chofer;

public class controlador_chofer {
    public vista_chofer obj_vista;
    public controlador_chofer (vista_chofer obj_vista){
        this.obj_vista = obj_vista;
    }
    
    public ChoferModelo procesar_datos(){
        String dato_nombre = this.obj_vista.tomar_nombre();
        String dato_licencia = this.obj_vista.tomar_licencia();
        String dato_cedula = this.obj_vista.tomar_cedula();
        ChoferModelo obj_chofer = new ChoferModelo (dato_nombre, dato_licencia, dato_cedula);
        
        // La vista muestra los datos ingresados
        this.obj_vista.mostrar_datos(obj_chofer.getNombre_chofer(), obj_chofer.getLicencia_chofer(), obj_chofer.getCedula_chofer());
        
        return obj_chofer;
    }
}
