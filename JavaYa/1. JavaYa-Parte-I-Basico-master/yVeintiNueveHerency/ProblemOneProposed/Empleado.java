package yVeintiNueveHerency.ProblemOneProposed;

import java.util.*;

public class Empleado extends Persona {
    protected double sueldo;
    
    public void cargarSueldo() {
        System.out.print("Ingresar sueldo: ");
        sueldo = teclado.nextDouble();
    }
    
    public void imprimirSueldo() {
        System.out.println("--------- SUELDO DEL EMPLEADO---------");
        System.out.println("El sueldo del empleado es: " + sueldo);
        System.out.println();
    }   
}
