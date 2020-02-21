package lPaginaDiezSeisStructureDataVector;

import java.util.*;

public class ProblemOneProposed {
    private Scanner teclado;
    private int[] numero;
    private int contador = 0;
    
    public void inicializar(){
    teclado = new Scanner(System.in);
    numero = new int[8];
    
        for (int i = 0; i < 8; i++) {
            contador += 1;
            System.out.print("Ingrese numero " + contador + ": "); 
            numero[i] = teclado.nextInt();
        }           
    }
    
    public void acumulado(){
        int suma = 0;
        for (int i = 0; i < 8; i++) {
            suma += numero[i];
        }    
        System.out.println("La suma de los valores da: " + suma);
    }
    
     public void condicionMayor36(){        
        int suma = 0;
         for (int i = 0; i < 8; i++) {
             if (numero[i] > 36) {
                 suma += numero[i];
             }
         }
   
        System.out.println("La suma de los elementos mayores a 36 es: " + suma);
    }
     
     public void condicionMayor50(){        
        int cant = 0;
         for (int i = 0; i < 8; i++) {
             if (numero[i] > 50) {
                 cant ++;
             }
         }
   
        System.out.println("Los elementos mayores a 50 son: " + cant);
    }
    
    public static void main(String[] args) {
        ProblemOneProposed numeros = new ProblemOneProposed();
        numeros.inicializar();
        numeros.acumulado();
        numeros.condicionMayor36();
        numeros.condicionMayor50();
    }
}
