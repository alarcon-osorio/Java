package poo;

import java.util.Arrays;

//Video 41 - Herencia II
public class VehiculoUso {
    public static void main(String[] args) {
        Coche coche1 = new Coche();
        coche1.establecerColor("Rojo");
        Furgoneta furgoneta1 = new Furgoneta(3,2000);
        furgoneta1.establecerColor("Verde");
        furgoneta1.establecerAsientos("Si");
        furgoneta1.establecerClimatizador("Si");
        System.out.println(coche1.obtenerDatos() + "\n" + coche1.obtenerColor());
        System.out.println("---Furgoneta----");
        System.out.println(furgoneta1.obtenerDatos() + "\n" + furgoneta1.getData());
    }
}
