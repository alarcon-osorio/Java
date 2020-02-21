package uVeintiCincoMatrixIrregulars;

import java.util. *; 

public class ProblemOne {
    private Scanner teclado;
    private int[][] matrix;
    private int filas, columnas, contador;
    
    
    public void inicializar(){
        teclado = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de filas: "); 
        filas = teclado.nextInt();
        matrix = new int[filas][];
        contador = 0;
        for (int i = 0; i < matrix.length; i++) {
            contador += 1;
            System.out.print("Cuantos elementos tiene la fila " + contador + ": ");
            columnas = teclado.nextInt();
            matrix[i] = new int[columnas];
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Ingresar valor matriz : ");
                matrix[i][j] = teclado.nextInt();
            }
        }
    }
    
    public void imprimir(){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        ProblemOne po = new ProblemOne();
        po.inicializar();
        po.imprimir();
    }
}
