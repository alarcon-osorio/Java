package PaginaDiezWhile;

import java.util.*;

public class ProbremThree {
    public static void main(String[] args) {
        int x = 1;
        int suma = 0;
        int valor, promedio;
                
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese 10 numeros: ");        
         
        while(x <= 10){
            valor = teclado.nextInt();
            suma += valor;
            x += 1;
        } 
        promedio = suma / 10;
        System.out.println("La suma es: " + suma);
        System.out.println("El promedio es: " + promedio);        
        
    }
}
