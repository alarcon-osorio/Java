package com.company;

import java.util.Arrays;

public class ArraysVideo25 {
    public static void main(String[] args) {
        //Array dos dimensiones
        int [][] matrix = new int [2][3];

        matrix[0][0] =15;
        matrix[0][1] =25;
        matrix[0][2] =35;

        matrix[1][0] =45;
        matrix[1][1] =55;
        matrix[1][2] =65;

        System.out.println("args = " + matrix[0][2]);

        for (int i=0;i<2;i++){
            for (int j=0;j<3;j++){
                System.out.print(matrix[i][j] + " ");
            }
        }

    }
}
