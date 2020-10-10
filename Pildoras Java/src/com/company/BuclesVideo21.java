package com.company;

import javax.swing.*;
import java.util.Arrays;

public class BuclesVideo21 {

    public static void main(String[] args) {

        //Ejemplo 1 - Repeticiones 5
        String nombre= "Jeison";
        for(int i = 0; i<10;i+=2){
            System.out.println("Nombre = " + nombre);
        }

        //Ejemplo 2 - metodo charAt y length
        boolean arroba = false;
        String email = JOptionPane.showInputDialog("Introduce E-Mail");
        for(int i=0; i<email.length(); i++){
            if (email.charAt(i) == '@'){
                arroba = true;
            }
        }

        if (arroba == true){
            System.out.println("Tiene arroba");
        }else{
            System.out.println("No tiene arroba");
        }
    }
}
