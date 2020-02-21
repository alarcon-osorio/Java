package uVeintiCincoMatrixIrregulars;

import java.util.*;

public class ProblemOnePropsed {
    private Scanner teclado;
    private int[][] matrix;
    private int filas;
    
    public void inicializar(){
        teclado = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de filas: ");
        filas = teclado.nextInt();
        matrix = new int[filas][];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = new int[i + 1];
        }
    }
    
    public void imprimir(){
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("Fila " + (i + 1));
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Columna " + (j+1) + ": ");
                matrix[i][j] = teclado.nextInt();
            }
            System.out.println();
        }    
    }
    
    public static void main(String[] args) {
        ProblemOnePropsed pop = new ProblemOnePropsed();
        pop.inicializar();
        pop.imprimir();
    }    
}
