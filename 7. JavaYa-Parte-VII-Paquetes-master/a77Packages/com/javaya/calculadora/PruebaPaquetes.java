package a77Packages.com.javaya.calculadora;

import a77Packages.com.javaya.rutinas.Matematica;
import a77Packages.com.javaya.rutinas.Cadena;

public class PruebaPaquetes {

    public static void main(String []ar) {
        System.out.println("La suma de 2+2 es "+Matematica.sumar(2, 2));
        String cadena="Hola Mundo";
        System.out.println(Cadena.mayuscula(cadena));
    }
}
