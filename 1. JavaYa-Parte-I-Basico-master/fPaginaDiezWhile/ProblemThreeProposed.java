package PaginaDiezWhile;

import java.util.*;

public class ProblemThreeProposed {
    public static void main(String[] args) {
        int empleados, x, contador1, contador2, suma;
        float  sueldo;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese Cantidad de empleados: ");
        empleados = teclado.nextInt();
        x = 0;
        suma = 0;
        contador1 = 0;
        contador2 = 0;
        sueldo = 0;
        while(x < empleados){
            x += 1;
            System.out.println("Ingrese Sueldo empleado: " + x);
            sueldo = teclado.nextFloat();
            
            if(sueldo >= 100 && sueldo <= 300){
                contador1 += 1;
            }else if(sueldo > 300){
                contador2 += 1;
            }else{
                System.out.println("Sueldo Invalido");
            }
            
            
            suma += sueldo; 
        }
        System.out.println("Ganan entre 100 y 300 : " + contador1 + " Empleados");  
        System.out.println("Ganan mas de 300 : " + contador2 + " Empleados"); 
        System.out.println("Total pagado es: " + suma);
        
    }
    
    
    
    
}
