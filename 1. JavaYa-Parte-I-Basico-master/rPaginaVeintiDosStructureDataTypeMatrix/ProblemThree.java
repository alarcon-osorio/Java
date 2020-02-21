package rPaginaVeintiDosStructureDataTypeMatrix;

import java.util.*;

public class ProblemThree {
    private Scanner teclado;
    private int[][] matriz;
    private int contador;
    
    public void iniciar(){
        teclado = new Scanner(System.in);
        matriz = new int[3][4];
        
        contador = 0;
        for (int i = 0; i < 3; i++) {
            contador +=1;
            for (int j = 0; j < 4; j++) {
                System.out.print("Ingrese el valor " + contador + ": ");
                matriz[i][j] = teclado.nextInt();
            }            
        }
    }
    
    public void primeraFila(){
        for (int i = 0; i < 4; i++) {
            System.out.print(matriz[0][i] + " - ");                   
        }
        System.out.println("Primera Fila");
    }
    
    public void ultimaFila(){
        for (int i = 0; i < 4; i++) {
            System.out.print(matriz[2][i] + " - ");                   
        }
        System.out.println("Ultima Fila");
    }
    
    public void primerColumna(){
        for (int i = 0; i < 3; i++) {
            System.out.print(matriz[i][0] + " - ");                   
        }
        System.out.println("Primer Columna");
    }
    
    
    public static void main(String[] args) {
        ProblemThree pt = new ProblemThree();
        pt.iniciar();
        pt.primeraFila();
        pt.ultimaFila();
        pt.primerColumna();
    } 
    
}
