package Modelo;

import Vista.vista_carro;

public class CarroModelo {

    String marca_carro = "";
    String color_carro = "";
    String placa_carro = "";

    public CarroModelo(String dato_marca, String dato_color, String dato_placa) {
        this.marca_carro = dato_marca;
        this.color_carro = dato_color;
        this.placa_carro = dato_placa;
    }

    public String getMarca_carro() {
        return marca_carro;
    }

    public void setMarca_carro(String marca_carro) {
        this.marca_carro = marca_carro;
    }

    public String getColor_carro() {
        return color_carro;
    }

    public void setColor_carro(String color_carro) {
        this.color_carro = color_carro;
    }

    public String getPlaca_carro() {
        return placa_carro;
    }

    public void setPlaca_carro(String placa_carro) {
        this.placa_carro = placa_carro;
    }

    // Reglas de negocio del Carro
    public boolean validarCarro(vista_carro obj_vista) {
        if (marca_carro == null || marca_carro.trim().equals("")) {
            obj_vista.mostrar_error_marca_vacia();
            return false;
        }
        if (color_carro == null || color_carro.trim().equals("")) {
            obj_vista.mostrar_error_color_vacio();
            return false;
        }
        if (placa_carro == null || placa_carro.trim().equals("")) {
            obj_vista.mostrar_error_placa_vacia();
            return false;
        }
        return true;
    }

    public void buscar_placa(String info_placa, vista_carro obj_vista) {
        if (this.placa_carro.equalsIgnoreCase(info_placa)) {
            obj_vista.mostrar_placa_encontrada(marca_carro);
        } else {
            obj_vista.mostrar_placa_no_coincide();
        }
    }
}
