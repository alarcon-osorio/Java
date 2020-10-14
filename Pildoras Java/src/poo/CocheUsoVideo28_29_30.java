package poo;

import java.util.Arrays;

public class CocheUsoVideo28_29_30 {

    public static void main(String[] args) {
        //Instanciamos la clase
        CocheVideo28_29_30 Renault = new CocheVideo28_29_30(); //Ejemplar de Clase Video 30
        //Renault.ruedas = 3; // No modificar desde aqui esas propiedades, con esto se aplica encapsulacion(anota error ruedas)
        //Metodos Getters y Setters Video 30
        System.out.println("El Coche tiene " + Renault.obtenerLargo());
        //Se llama desde la clase de Coche
        Renault.estableceColor();
        System.out.println(Renault.ObtieneColor());

    }

}
