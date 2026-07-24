package Controlador;

import Modelo.CarroModelo;
import Vista.vista_carro;

public class controlador_carro {
    public vista_carro obj_vista;
    public controlador_carro (vista_carro obj_vista){
        this.obj_vista = obj_vista;
    }
    
    public CarroModelo procesar_datos(){
        CarroModelo obj_carro;
        do {
            String dato_marca = this.obj_vista.tomar_marca();
            String dato_color = this.obj_vista.tomar_color();
            String dato_placa = this.obj_vista.tomar_placa();
            obj_carro = new CarroModelo (dato_marca, dato_color, dato_placa);
        } while (!obj_carro.validarCarro(this.obj_vista));
        
        // La vista muestra los datos ingresados
        this.obj_vista.mostrar_datos(obj_carro.getMarca_carro(), obj_carro.getColor_carro(), obj_carro.getPlaca_carro());
        
        return obj_carro;
    }
}