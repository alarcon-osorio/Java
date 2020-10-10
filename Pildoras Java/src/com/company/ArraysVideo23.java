package com.company;

import java.util.Arrays;

public class ArraysVideo23 {
    public static void main(String[] args) {

        //forma 1 larga y manual
        int[] mi_matriz = new int [5];
        mi_matriz[0] = 5;
        mi_matriz[1] = 4;
        mi_matriz[2] = 3;
        mi_matriz[3] = 2;
        mi_matriz[4] = 1;
        System.out.println("Matriz 0 " + mi_matriz[0]);
        System.out.println("Matriz 1 " + mi_matriz[1]);
        System.out.println("Matriz 2 " + mi_matriz[2]);
        System.out.println("Matriz 3 " + mi_matriz[3]);

        for (int i=0; i<5; i++){
            System.out.println(mi_matriz[i]);
        }

        System.out.println("------------");

        //forma dos resumida
        int[] array = {1,2,3,4,5,6};
        for (int i=0; i<6;i++) {
            System.out.print(array[i]);
        }

    }
}
