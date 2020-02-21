package rPaginaVeintiTresMatixCantFyC;

import java.util.*;

public class ProblemOneProposed {
    private Scanner teclado;
    private int[][] matrix;
    private int filas, columnas, contador;
       
    public void iniciar(){
        teclado = new Scanner(System.in);
        System.out.print("Ingrese filas: ");
        filas = teclado.nextInt();
        System.out.print("Ingrese Columnas: ");
        columnas = teclado.nextInt();
        matrix = new int[filas][columnas];
        contador = 0;
        
        for (int i = 0; i < matrix.length; i++) {
            contador += 1;
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Ingrese valor " + contador + ": ");
                matrix[i][j] = teclado.nextInt();
            }
        }       
    }
      
    public void imprimirIntercambio(){
        System.out.println("Intercambio fila uno y dos");
        for(int c=0;c<matrix[0].length;c++) {
            int aux=matrix[0][c];
            matrix[0][c]=matrix[1][c];
            matrix[1][c]=aux;
        }      
    } 
    
    public void imprimirNormal(){
        System.out.println("Matriz intercambiada");
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[i].length;j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }       
    }     
    
    public static void main(String[] args) {
        ProblemOneProposed pop = new ProblemOneProposed();
        pop.iniciar();         
        pop.imprimirIntercambio();
        pop.imprimirNormal();
    }
}
