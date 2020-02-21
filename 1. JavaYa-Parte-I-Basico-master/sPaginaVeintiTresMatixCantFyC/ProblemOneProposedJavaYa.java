package rPaginaVeintiTresMatixCantFyC;

import java.util.Scanner;

public class ProblemOneProposedJavaYa {
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
        
    public void intercambiar() {
        for(int c=0;c<mat[0].length;c++) {
            int aux=mat[0][c];
            mat[0][c]=mat[1][c];
            mat[1][c]=aux;
        }
    }
    
    public void imprimir() {
        for(int f=0;f<mat.length;f++) {
            for(int c=0;c<mat[f].length;c++) {
                System.out.print(mat[f][c]+" ");
            }
            System.out.println();
        }
    }    
    
    public static void main(String[] ar) {
        ProblemOneProposedJavaYa ma=new ProblemOneProposedJavaYa();
        ma.cargar();
        ma.intercambiar();
        ma.imprimir();
    }   
}