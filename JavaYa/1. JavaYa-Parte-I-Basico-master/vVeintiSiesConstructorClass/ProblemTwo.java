package vVeintiSiesConstructorClass;

import java.util.*;

public class ProblemTwo {
    private Scanner teclado;
    private String nombre;
    private int edad;
    
    public ProblemTwo(){
        teclado = new Scanner(System.in);
        System.out.print("Ingrese nombre: ");
        nombre = teclado.next();
        System.out.print("Ingrese Edad: ");
        edad = teclado.nextInt();
    }
    
    public void imprimir(){
        if (edad >= 18) {
            System.out.println("El señor " + nombre + " de " + edad + " años es mayor de edad");
        }else if(edad > 14){
            System.out.println("El joven " + nombre + " de " + edad + " años NO es mayor de edad");
        }else{
            System.out.println("El niño " + nombre + " de " + edad + " años NO es mayor de edad");
        }
    }
    
    public static void main(String[] args) {
        ProblemTwo pt = new ProblemTwo();
        pt.imprimir();
    }
}
