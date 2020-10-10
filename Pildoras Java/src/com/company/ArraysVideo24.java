package com.company;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Arrays;

public class ArraysVideo24 {
    public static void main(String[] args) {

        String [] paises = new String [8];

        paises[0] = "Colombia";
        paises[1] = "Peru";
        paises[2] = "España";
        paises[3] = "E.U";
        paises[4] = "Mexico";
        paises[5] = "Italia";
        paises[6] = "Argentina";
        paises[7] = "Brazil";

        /*for (int i=0; i< paises.length;i++){
            System.out.println("Pais " + (i + 1) + " " + paises[i]);
        }*/

        String [] ciudades = {"Bogota","SaoPaulo","Madrid","NewYork"};
        //for mejorado o forEach
        for(String elemento:ciudades){
            System.out.println("Pais = " + elemento);
        }

        /*
        String [] provincias = new String[2];
        for (int i=0;i<8;i++){
            provincias[i] = JOptionPane.showInputDialog("Introduce Provincia " + (i+1));
        }

        for(String elemento:provincias){
            System.out.println("Provincias = " + elemento);
        }
        */

        int [] matriz_aleatorios = new int[150];
        for (int i=0; i<matriz_aleatorios.length;i++){
            matriz_aleatorios[i]=(int)Math.round(Math.random()*100);
        }

        for(int numeros:matriz_aleatorios){
            System.out.println(numeros);
        }



    }
}
