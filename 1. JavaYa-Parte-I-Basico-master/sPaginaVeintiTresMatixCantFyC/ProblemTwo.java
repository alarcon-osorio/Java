package rPaginaVeintiTresMatixCantFyC;

import java.util.*;

public class ProblemTwo {
   private Scanner teclado;
   private  int [][] matriz;
   private int filas, columnas, conteo;
   
   public void iniciar(){
       teclado = new Scanner(System.in);
       System.out.print("Igrese Filas: ");
       filas = teclado.nextInt();
       System.out.print("Igrese Columnas: ");
       columnas = teclado.nextInt();
       matriz = new int[filas][columnas];   
       conteo = 0;
       for (int i = 0; i < filas; i++) {
           conteo += 1;
           for (int j = 0; j < columnas; j++) {
               System.out.print("Ingrese valores matriz " + conteo + ": ");
               matriz[i][j] = teclado.nextInt();
           } 
       }
   }
   
   public void imprimir(){
       System.out.println("La matriz se compone de: ");
       for (int i = 0; i < filas; i++) {
           for (int j = 0; j < columnas; j++) {
               System.out.print(matriz[i][j] + " ");
           }
           System.out.println("");
       }
   }
   
   public void mayor(){
       int mayor = matriz[0][0];
       int fila_may = 0;
       int columna_may = 0; 
       for (int i = 0; i < filas; i++) {
           for (int j = 0; j < columnas; j++) {
               if (matriz[i][j] > mayor) {
                   mayor = matriz[i][j];
                   fila_may = i;
                   columna_may = j;                  
               }
           }
       }
       System.out.println("El elemento mayor es: " + mayor);
       System.out.println("Estos valores se encuentran en la fila: " + fila_may + " columna: " + columna_may);
   }
      
    public static void main(String[] args) {
        ProblemTwo pt = new ProblemTwo();
        pt.iniciar();
        pt.imprimir();
        pt.mayor();
    }
}
