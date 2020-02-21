package vVeintiSiesConstructorClass;

import java.util.*;

public class ProblemOneProposed {
    private Scanner teclado;
    private String nombre;
    private float sueldo;
    
    public ProblemOneProposed(){
        teclado = new Scanner(System.in);
        System.out.print("Ingrese nombre: ");
        nombre = teclado.next();
        System.out.print("Ingrese sueldo: ");
        sueldo = teclado.nextFloat();
    }
    
    public void imprimir(){;
        System.out.println("Nombre: " + nombre + " Sueldo: " + sueldo);
    }
    
    public void sueldoMayor(){
        if (sueldo > 3000) {
           System.out.println("Debe pagar impuestos");
        }else{
            System.out.println("NO debe pagar impuestos");
        }
    }
    
    public static void main(String[] args) {
        ProblemOneProposed pop = new ProblemOneProposed();
        pop.imprimir();
        pop.sueldoMayor();
    }
}
