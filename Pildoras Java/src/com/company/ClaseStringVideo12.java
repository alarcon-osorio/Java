package com.company;

import java.util.Arrays;

public class ClaseStringVideo12 {
    public static void main(String[] args) {

        String frase =  "Aprendiendo programacion";
        System.out.println("Estas = " + frase.substring(0,11));

        String alumno1, alumno2;
        alumno1 = "David";
        alumno2 = "david";
        System.out.println("Iguales? no ignora Mayus = " + alumno1.equals(alumno2));
        System.out.println("Iguales? ignora Mayus= " + alumno1.equalsIgnoreCase(alumno2));

    }
}
