package rPaginaVeintiTresMatixCantFyC;

import java.util.*;

public class ProblemOne {
    private Scanner teclado;
    private int [][] matriz;
    private int cant1, cant2, contador;
    
    public void cargar(){
        teclado = new Scanner(System.in);        
        System.out.print("Ingrese cantidad de filas de la matriz: ");
        cant1 = teclado.nextInt();
        System.out.print("Ingrese cantidad de columnas de la matriz: ");
        cant2 = teclado.nextInt();
        matriz = new int[cant1][cant2];
        contador = 0;
        
        for (int i = 0; i < matriz.length; i++) {
            contador += 1;            
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Ingrese el valor " + contador + " de la matriz: ");
                matriz[i][j] = teclado.nextInt();
            }            
        }
    }
    
    public void imprimir(){
        System.out.println("Los valores de la tariz son: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Length de la matriz = " + matriz.length + " = Filas");
    }
    
    public void imprimirUltimaFila() {
    	System.out.println("Ultima fila");
        for (int i = 0; i < matriz[matriz.length -1].length; i++) {
            System.out.print(matriz[matriz.length - 1][i] + " ");
        }
        System.out.println("Resultado de matriz[matriz.length -1].length= " + matriz[matriz.length -1].length);
    }    
    
    public static void main(String[] args) {
        ProblemOne po = new ProblemOne();
        po.cargar();
        po.imprimir();
        po.imprimirUltimaFila();
    }
    
    
}
