package mPaginaDiezSieteSizeVector;

import java.util.*;
public class ProblemOne {
    private Scanner teclado;
    private int[] sueldos;
    private int n;
    private int contador;
    
    public void inicializar(){
        teclado = new Scanner(System.in); 
        System.out.println("Ingrese la cantidad de sueldos");
        n = teclado.nextInt();
        sueldos = new int[n];       
    }
    
    public void imprimirSolicitud(){
        contador = 0;       
        for (int i = 0; i < sueldos.length; i++) {
            contador += 1;
            System.out.print("Ingrese sueldo numero " + contador + ": ");
            sueldos[i] = teclado.nextInt();                
        }      
    }
    
    public void imprimirResultados(){
        contador = 0;
        int suma = 0;
        for (int i = 0; i < sueldos.length; i++) {
            contador += 1;
            suma += sueldos[i];
            System.out.println("Sueldo " + contador + ": " + sueldos[i]);            
        }
        System.out.println("La suma de los sueldos es: " + suma);        
    }
     
    public static void main(String[] args) {
        ProblemOne vectorParam = new ProblemOne();
        vectorParam.inicializar();
        vectorParam.imprimirSolicitud();
        vectorParam.imprimirResultados();
    }
    
}
