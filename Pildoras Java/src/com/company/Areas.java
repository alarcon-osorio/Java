package com.company;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class Areas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Elige una opción: \n1. Cuadrado \n2. Rectangulo \n3 Triangulo \n4. Circulo ");
        int figura = entrada.nextInt();
        
        switch (figura){
            case 1:
                int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
                System.out.println("El area del cuadraro es = " + Math.pow(lado,2));
                break;

            case 2:
                int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
                int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
                System.out.println("la base del rectangulo es = " + base * altura);
                break;
        }

    }

}
