package PaginaSieteIFSimple;

import java.util.Scanner;

public class ProblemPrincipal {
    public static void main(String[] args){
        double sueldo;
        
        Scanner teclado = new Scanner(System.in);        
        
        System.out.println("Ingrese el sueldo del empleado: ");
        sueldo = teclado.nextDouble();
        
        if(sueldo > 3000){
            System.out.println("El empleado debe pagar impuestos ");
        }else{
            System.out.println("El empleado NO debe pagar impuestos ");
        }
        
        
        
    
    }
}
