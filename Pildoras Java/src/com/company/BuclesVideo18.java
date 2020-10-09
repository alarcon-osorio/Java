package com.company;

import javax.swing.*;
import java.util.Arrays;

public class BuclesVideo18 {

    public static void main(String[] args) {

        String clave = "Jeison";
        String pass = "";

        int contador = 0;

        while (clave.equals(pass) == false){
            pass = JOptionPane.showInputDialog("Introduce Contraseña");

            if (clave.equals(pass) == false){
                System.out.println("Contraseña falsa = " + pass);
            }
        }

        System.out.println("Descifrando ... ");
        while(contador <= 10) {
            System.out.print(contador = contador + 1);
        }

        System.out.println("Acceso Permitido: " + clave);
    }
}
