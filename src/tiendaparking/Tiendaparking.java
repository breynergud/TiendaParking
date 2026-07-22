package tiendaparking;

import Vista.vista_carro;
import Vista.vista_chofer;
import Vista.vista_motor;
import Controlador.controlador_carro;
import Controlador.controlador_chofer;
import Controlador.controlador_motor;
import Modelo.CarroModelo;
import Modelo.ChoferModelo;
import Modelo.MotorModelo;

public class Tiendaparking {

    public static void main(String[] args) {

        vista_carro vista_carro = new vista_carro();
        controlador_carro ctrl_carro = new controlador_carro(vista_carro);
        CarroModelo carro = ctrl_carro.procesar_datos();

        vista_motor vista_motor = new vista_motor();
        controlador_motor ctrl_motor = new controlador_motor(vista_motor);
        MotorModelo motor = ctrl_motor.procesar_datos();

        vista_chofer vista_chofer = new vista_chofer();
        controlador_chofer ctrl_chofer = new controlador_chofer(vista_chofer);
        ChoferModelo chofer = ctrl_chofer.procesar_datos();
    }
}