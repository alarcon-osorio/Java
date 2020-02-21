package PaginaDiezWhile;

import java.util.*;

public class ProblemTwoProposed {
    public static void main(String[] args) {
        float altura, suma;
        int personas;
        int x;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese cantidad de personas: ");
        personas = teclado.nextInt();       
        x = 0;
        altura = 0;
        suma = 0;
        while(x < personas){
            x += 1;
            System.out.println("Ingrese estatura persona: " + x);
            altura = teclado.nextFloat();
            suma += altura;            
        }        
        System.out.println("El promedio de estaturas es: " + suma/personas);
    }
}
