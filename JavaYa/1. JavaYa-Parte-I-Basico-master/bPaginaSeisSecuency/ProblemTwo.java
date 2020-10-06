package PaginaSeisSecuency;

import java.util.Scanner;

public class ProblemTwo {
    public static void main(String[] args){
        int numberOne, numberTwo, numberThree, numberFour, suma, producto;
        
        System.out.print("Ingrese 4 numeros: ");
        
        Scanner teclado = new Scanner(System.in);
        numberOne = teclado.nextInt();
        numberTwo = teclado.nextInt();
        numberThree = teclado.nextInt();
        numberFour = teclado.nextInt();
        
        suma = numberOne + numberTwo;
        producto = numberThree * numberFour;      
        
        
        System.out.println("La suma del 1 y 2 es: " + suma);
        System.out.println("El producto del 3 y 4 es: " + producto);
        
        
    }
}
