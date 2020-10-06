package rPaginaVeintiTresMatixCantFyC;

import java.util.Scanner;

public class PproblemTwoPorposedJavaYa {
    private Scanner teclado;
    private int[][] mat;
    
    public void cargar() {
        teclado=new Scanner(System.in);
        System.out.print("Cuantas fila tiene la matriz:");
        int filas=teclado.nextInt();
        System.out.print("Cuantas columnas tiene la matriz:");
        int columnas=teclado.nextInt();
        mat=new int[filas][columnas];
        for(int f=0;f<mat.length;f++) {
            for(int c=0;c<mat[f].length;c++) {
                System.out.print("Ingrese componente:");
                mat[f][c]=teclado.nextInt();
            }
        }
    }
    
    public void imprimir(){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
        }        
        System.out.println();
    }
           
    public void imprimirVertices() {
    	System.out.println("Vértice superior izquierdo: " + mat[0][0]);
    	System.out.println("Vértice superior derecho: " + mat[0][mat[0].length-1]); 
    	System.out.println("Vértice inferior izquierdo: " + mat[mat.length-1][0]);
    	System.out.println("Vértice inferior derecho: " + mat[mat.length-1][mat[mat.length-1].length-1]);
    }    
    
    public static void main(String[] ar) {
        PproblemTwoPorposedJavaYa ma=new PproblemTwoPorposedJavaYa();
        ma.cargar();
        ma.imprimir();
        ma.imprimirVertices();
    }   
}