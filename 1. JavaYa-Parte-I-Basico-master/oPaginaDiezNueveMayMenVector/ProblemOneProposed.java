package oPaginaDiezNueveMayMenVector;

import java.util.*;

public class ProblemOneProposed {
    private Scanner teclado;
    private int[] elementos;
    int menor;
    
    public void inicializar(){
        teclado = new Scanner(System.in);
        int cant;
        System.out.println("Ingrese la cantidad de valores a comparar: ");
        cant = teclado.nextInt();
        elementos = new int[cant];
        int contador = 0;
        for (int i = 0; i < elementos.length; i++) {
            contador += 1;
            System.out.println("Ingresar valor " + contador + ": ");
            elementos[i] = teclado.nextInt();
        }
        
    }
    
    public void calcular(){        
        int valor = 0;      
        menor = elementos[0];
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i] < menor) {
                menor = elementos[i];
            }
        }
        System.out.println("El menor valor ingresado es: " + menor);
    }
    
    public void valorRepetido(){
        int cant = 0;
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i] == menor) {
                cant ++;
            }
        }
        if (cant > 1) {
            System.out.println("Se repite en varios vectores");
        }else{
            System.out.println("No se repite");
        }
    }
    
    
    
    public static void main(String[] args) {
        ProblemOneProposed twoProposed = new ProblemOneProposed();
        twoProposed.inicializar();
        twoProposed.calcular();
        twoProposed.valorRepetido();
    }
    
}
