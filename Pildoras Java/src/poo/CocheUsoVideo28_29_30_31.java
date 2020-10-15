package poo;

import java.util.Arrays;

public class CocheUsoVideo28_29_30_31 {

    public static void main(String[] args) {
        //Instanciamos la clase
        CocheVideo28_29_30_31 Renault = new CocheVideo28_29_30_31(); //Ejemplar de Clase Video 30
        //Renault.ruedas = 3; // No modificar desde aqui esas propiedades, con esto se aplica encapsulacion(anota error ruedas)
        //Metodos Getters y Setters Video 30
        System.out.println(Renault.obtenerDatos());
        //Se llama desde la clase de Coche
        //Renault.estableceColor(); Video 31 arroja error
        Renault.establecerColor("amarillo");
        //Renault.color = "Rosa";  //-- Video 31 Problema de concepto encapsulacion marcar private
        System.out.println(Renault.obtenerColor());
        //Video 31 -->Envio parametros
        Renault.establecerAsientos("si");
        System.out.println("Resultado = " + Renault.obtenerAsientos());

    }

}
