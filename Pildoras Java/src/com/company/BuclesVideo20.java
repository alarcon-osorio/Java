package com.company;

import javax.swing.*;
import java.util.Arrays;

public class BuclesVideo20 {
    public static void main(String[] args) {

        String genero = "";

        do{
            genero = JOptionPane.showInputDialog("Introduce tu genero (Hombre/Mujer)");
        }while(genero.equalsIgnoreCase("Hombre") == false && genero.equalsIgnoreCase("Mujer") == false);
        //Mientras sea diferente a las dos condiciones

        int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura:"));
        int pesoIdeal = 0;

        if(genero.equalsIgnoreCase("Hombre")) {
            pesoIdeal = altura - 110;
        }
        else if(genero.equalsIgnoreCase("Mujer")) {
            pesoIdeal = altura - 120;
        }

        System.out.println("Eres: " + genero + " y tu altura es: " + altura + "CM");
        System.out.println("El peso ideal es: = " + pesoIdeal + "KG");

    }
}
