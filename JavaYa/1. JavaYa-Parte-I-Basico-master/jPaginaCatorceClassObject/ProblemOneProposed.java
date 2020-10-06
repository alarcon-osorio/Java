package PaginaCatorceObjectsClass;

import java.util.*;

public class ProblemOneProposed {
    private Scanner teclado;
    private String nombre;
    private int sueldo;
    
    public void inicializar(){
        teclado = new Scanner(System.in);
        System.out.println("Ingrese Nombre: ");
        nombre = teclado.nextLine();
        
        System.out.println("Ingrese Sueldo: ");
        sueldo = teclado.nextInt();
    }
    
    public void imprimirData(){
        System.out.println("El empleado " + nombre + " Gana: " + sueldo);
    }
    
    public void imprimirImpuestos(){
        if(sueldo >= 3000000){    
            System.out.println("Debe pagar impuestos");
        }else{
           System.out.println("NO debe pagar impuestos"); 
        }
    }
        
    public static void main(String[] args) {
        ProblemOneProposed empleado = new ProblemOneProposed();
        empleado.inicializar();
        empleado.imprimirData();
        empleado.imprimirImpuestos();
    }
}
