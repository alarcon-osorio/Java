package pPaginaVeinteOrdenVectors;

import java.util.*;

public class ProblemOne {
    private Scanner teclado;
    private float[] sueldos;
    private int contador;
    
    public void inicializar(){
        teclado = new Scanner(System.in);
        sueldos = new float[5];
        contador = 0;
        for (int i = 0; i < sueldos.length; i++) {
            contador += 1;
             System.out.println("Ingrese sueldo " + contador);
             sueldos[i] = teclado.nextFloat();
        }            
    } 
    
    public void ordenar(){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {                
                if (sueldos[i] > sueldos[i+1]) {
                    float aux ;
                    aux = sueldos[i];
                    sueldos[i] = sueldos[i+1];
                    sueldos[i+1] = aux;                
                }
            }
        }
    }     
     
    public void imprimir(){
        System.out.println("Sueldos ordenados de manor a mayor");
        for (int i = 0; i < sueldos.length; i++) {
            System.out.println(sueldos[i]);
        }
    }
    
    public static void main(String[] args) {
        ProblemOne po = new ProblemOne();
        po.inicializar();
        po.ordenar();
        po.imprimir();
    }
}
