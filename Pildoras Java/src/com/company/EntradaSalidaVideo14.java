package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class EntradaSalidaVideo14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu nombre: ");

        String nombre = entrada.nextLine();

        System.out.println("Introduce edad:");

        int edad = entrada.nextInt();

        System.out.println("Nombre: " + nombre + " Edad: " + edad);

    }
}
