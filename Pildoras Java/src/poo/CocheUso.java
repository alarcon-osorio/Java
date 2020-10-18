package poo;

import javax.swing.*;

public class CocheUso {

    public static void main(String[] args) {
        //Instanciamos la clase
        Coche Renault = new Coche(); //Ejemplar de Clase Video 30
        //Renault.ruedas = 3; // No modificar desde aqui esas propiedades, con esto se aplica encapsulacion(anota error ruedas)
        //Metodos Getters y Setters Video 30
        System.out.println(Renault.obtenerDatos());
        //Se llama desde la clase de Coche
        //Renault.estableceColor(); Video 31 arroja error
        Renault.establecerColor(JOptionPane.showInputDialog("Introduce Color"));
        //Renault.color = "Rosa";  //-- Video 31 Problema de concepto encapsulacion marcar private
        System.out.println(Renault.obtenerColor());
        //Video 31 -->Envio parametros
        Renault.establecerAsientos(JOptionPane.showInputDialog("Tiene Asientos de cuero"));
        System.out.println(Renault.obtenerAsientos());
        //Video32
        Renault.establecerClimatizador(JOptionPane.showInputDialog("Tiene Aire acondicionado"));
        System.out.println(Renault.obtenerClimatizador());
        System.out.println(Renault.obtenerPesoCoche());
        System.out.println("El precio del coche es: $" + Renault.precioCoche());

    }

}
