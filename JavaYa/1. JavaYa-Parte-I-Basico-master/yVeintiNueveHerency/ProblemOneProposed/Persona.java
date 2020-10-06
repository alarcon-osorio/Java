package yVeintiNueveHerency.ProblemOneProposed;

import java.util.*;

public class Persona {
    protected Scanner teclado;
    protected String nombre;
    protected int edad;
    
    public Persona() {
        teclado = new Scanner(System.in);
    }
    
    public void cargarDatos() {
        System.out.print("Ingrese el nombre: ");
        nombre = teclado.next();
        System.out.print("Ingrese la edad: ");
        edad = teclado.nextInt();
    }    
    
    public void imprimir() {
        System.out.println("---------DATOS---------");
        System.out.println("Nombre: " + nombre + "\nEdad: " + edad);
    }   
}
