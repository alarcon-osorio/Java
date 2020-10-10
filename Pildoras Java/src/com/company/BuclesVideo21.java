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

        //Ejemplo 3 - metodo charAt y length
        int arroba2 = 0;
        boolean punto = false;
        String mail = JOptionPane.showInputDialog("Introduce E-Mail");
        for(int i=0; i<mail.length(); i++){
            if (mail.charAt(i) == '@'){
                arroba2 ++;
            }
        }

        for(int i=0; i<mail.length(); i++){
            if (mail.charAt(i) == '.'){
                punto = true;
            }
        }

        if (arroba2 == 1 && punto == true){
            System.out.println("Tiene una arroba y tiene punto pasa todas las validaciones");
        }else{
            System.out.println("Tiene mas de una arroba o no tiene punto revisar");
        }

    }
}
