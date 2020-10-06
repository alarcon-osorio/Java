package e63ForCollections;

import java.util.*;

public class ProblemTwo {
    private Scanner teclado;
    private int[][] matrix;
    private int filas, columnas;
    
    public ProblemTwo() {
        teclado = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de filas: ");
        filas = teclado.nextInt();
        System.out.print("Ingrese la cantidad de Columnas: ");
        columnas = teclado.nextInt();
        matrix = new int[filas][columnas];
        for (int i = 0; i < matrix.length; i++) {            
            for (int j = 0; j < matrix.length; j++) {
                System.out.print("Ingrese el valor numero " + (j+1) + ": ");
                matrix[i][j] = teclado.nextInt();
            }            
        }        
    }
    
    public void imprimir() {
        for (int[] fila: matrix) {
            for (int elemento : fila ) {
                System.out.print(elemento + " - ");
            }
        }System.out.println();
    }
    
    public static void main(String[] args) {
        ProblemTwo pt = new ProblemTwo();
        pt.imprimir();
    }
    
}
