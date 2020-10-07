package com.company;

import javax.swing.*;
import java.util.Arrays;

public class EntradaSalidaVideo15 {
    public static void main(String[] args) {

        //JOptionPane JOptionPane = new JOptionPane(); //No se debe istanciar esto no se debe hacer
        String nombre = JOptionPane.showInputDialog("Introduce tu nombre por favor: ");
        String edad = JOptionPane.showInputDialog("Introduce la Edad: ");

        int edadUsuario = Integer.parseInt(edad); // Para castear el tipo de dato ya que Input recibe solo String

        System.out.println("Datos = " + nombre + " Edad: " + edad + " En un año cumpliras " +  (edadUsuario+1));

    }
}
