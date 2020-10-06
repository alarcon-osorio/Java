package xVeintiOchoClassCollaboration.ProblemOneProposed;

import java.util.*;

public class Socio {
    private String nombre;
    private int antiguedad;
    
    public Socio(Scanner teclado) {
        System.out.print("Ingresar nombre: ");
        nombre = teclado.next();
        System.out.print("Ingresar antiguedad: ");
        antiguedad = teclado.nextInt();        
    }
    
    public void imprimirListaSocios() {        
        System.out.println("Nombre: " + nombre + " Antiguedad: " + antiguedad + " años");
    }
    
    public void imprimir() {
        System.out.println(" ------------------------------------------------------- ");
        System.out.println("El empleado: " + nombre + " tiene mayor antiguedad con: " + antiguedad + " años");
        System.out.println(" ------------------------------------------------------- ");
    }
    
    public int retornaAntiguedad(){
        return antiguedad;
    }
    
}
