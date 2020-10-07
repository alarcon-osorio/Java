package com.company;

import javax.swing.*;
import java.util.Arrays;

public class EntradaSalidaNumeroVideo15 {

    public static void main(String[] args) {
        double x =  10000.0;
        System.out.printf("%1.2f", x/3 ); // Cantidad de decimales

        System.out.println("---");

        String num1 = JOptionPane.showInputDialog("Introduce un numero");
        double num2 = Double.parseDouble(num1);
        System.out.print("Raiz de = " + num2 + " es: ");
        System.out.printf("%1.2f", Math.sqrt(num2));

    }
}
