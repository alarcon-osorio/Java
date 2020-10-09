package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class BuclesJuegoVideo19 {

    public static void main(String[] args) {

        int aleatorio = (int)(Math.random()*100);
        Scanner entrada = new Scanner(System.in);

        System.out.println(aleatorio); // La idea seria comentar este para saber cual fue el numero aleatorio

        int numero = 0;
        int intentos = 0;

        while (numero!=aleatorio){
            System.out.println("Introduce un numero por favor");
            numero = entrada.nextInt();

            if (aleatorio < numero){
                System.out.println("Mas bajo");
            }
            else if(aleatorio > numero){
                System.out.println("Mas alto");
            }
        }

        System.out.println("Correcto");

    }
}
