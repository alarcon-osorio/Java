package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class EvaluarEdadVideo16 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce Edad: ");
        int edad = entrada.nextInt();

        if(edad < 18 ) {
            System.out.println("Es menor de edad");
        }else if(edad < 21){
            System.out.println("No puede tomar");
        }else{
            System.out.println("Es mayor de edad y puede tomar" );
        }
    }
}
