package rPaginaVeintiDosStructureDataTypeMatrix;

import java.util.*;

public class ProblemTwo {
    private Scanner teclado;
    private int[][] matriz;
    private int contador;
    
    public void cargar(){
        teclado = new Scanner(System.in);
        matriz = new int[4][4];
        contador = 0;
        for (int i = 0; i < 4; i++) {
            contador +=1;
            for (int j = 0; j < 4; j++) {                
                System.out.print("Ingrese valor " + contador + ": ");
                matriz[i][j] = teclado.nextInt();
            }            
        }
    }
    
    public void imprimir(){
        for (int i = 0; i < 4; i++) {            
           System.out.print(matriz[i][i] + " - ");          
        }
    }
    
    public static void main(String[] args) {
        ProblemTwo pt = new ProblemTwo();
        pt.cargar();
        pt.imprimir();
    }
    
}
