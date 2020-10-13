package com.company;

import java.util.Arrays;

public class ArraysVideo26 {
    public static void main(String[] args) {

        int [][] matrix = {
                {10,15,20},
                {25,30,35}
        };

        //for tradicional
        for(int i=0;i< matrix.length;i++){
            System.out.println();
            for (int j=0; j< matrix.length;j++){
                System.out.println("Mat = " + matrix[i][j]);
            }
        }

        //for mejorado
        for (int[]fila:matrix){
            System.out.println();
            for (int z: fila){
                System.out.print(z + " ");
            }
        }

    }
}
