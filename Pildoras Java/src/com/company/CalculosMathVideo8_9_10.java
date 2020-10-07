package com.company;

import java.util.Arrays;

public class CalculosMathVideo8_9_10 {

    public static void main(String[] args) {

        double raiz = Math.sqrt(7);
        System.out.println("Resultado = " + raiz);

        double num1 = 5.85;
        long resultado = Math.round(num1);//devuelve long -- se puede castear con (int)Math.round(num1);
        System.out.println("Resultado = " + resultado);

        double base = 5;
        double exponente = 3;
        int resultadoPow = (int)Math.pow(base,exponente);
        System.out.println("Resultado = " + resultadoPow);

    }

}
