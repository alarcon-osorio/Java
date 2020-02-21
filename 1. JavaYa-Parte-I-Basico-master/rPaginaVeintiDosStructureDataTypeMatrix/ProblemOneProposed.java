package rPaginaVeintiDosStructureDataTypeMatrix;

import java.util.*;

public class ProblemOneProposed {
    private Scanner teclado;
    private int[][] matriz;
    private int contador;
    
    public void iniciar(){
        teclado = new Scanner(System.in);
        matriz = new int[2][5];
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Ingresar Fila " + i + " Ingrese Columna " + j + ": "); 
                matriz[i][j] = teclado.nextInt();
            }
            
        }
    }
    
    public void imprimir(){
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(matriz[i][j]);
            }   
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        ProblemOneProposed pop = new ProblemOneProposed();
        pop.iniciar();
        pop.imprimir();
    }
    
}
