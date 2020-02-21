package PaginaCatorceClassObject;

import java.util.*;
public class ProblemOne {
    private Scanner teclado;
    private String nombre;
    private int edad;
    
    public void inicializar(){
        teclado = new Scanner(System.in);
        System.out.println("Ingrese Nombre: ");
        nombre = teclado.nextLine();
        
        System.out.println("Ingrese edad:");
        edad = teclado.nextInt();
    }
        
    public void imprimir(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
        
    public void esMayorEdad(){
        if (edad >= 18) {
            System.out.println(nombre + " Es mayor de edad");                
        }else{
            System.out.println(nombre + " No es mayor de edad");
        }
    }
        
    public static void main(String[] args) {
        ProblemOne persona;
        persona = new ProblemOne();            
        persona.inicializar();
        persona.imprimir();
        persona.esMayorEdad();
    }
}

