package vVeintiSiesConstructorClass;

import java.util.*;

public class ProblemOne {
    private Scanner teclado;
    private double[] sueldos;
    private int cantidad, contador;
    
    public ProblemOne(){ //Clase llamada igual a este metodo diferencias que la palabra clave void desaparece
        teclado = new Scanner(System.in);
        System.out.print("cantidad de sueldos a liquidar: ");
        cantidad = teclado.nextInt();
        sueldos = new double[cantidad];
        contador = 1;
        for (int i = 0; i < sueldos.length; i++) {
            System.out.print("Ingrese el sueldo " + (contador++) + ": ");
            sueldos[i] = teclado.nextInt();
        }
    }
    
    public void imprimir(){
        System.out.println("---------Sueldos----------");
        for (int i = 0; i < sueldos.length; i++) {
            System.out.println(sueldos[i] + " ");
        }
    }
    
    
    public static void main(String[] args) {
        ProblemOne po = new ProblemOne();
        po.imprimir();  
    }
}
