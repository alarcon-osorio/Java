package PaginaSeisSecuency;

import java.util.Scanner;

public class ProblemThree {
    public static void main(String[] args){
        int numberOne, numberTwo, numberThree, numberFour, suma, promedio;
        System.out.print("Ingrese 4 numeros: ");
        
        Scanner teclado = new Scanner(System.in);
        
        numberOne = teclado.nextInt();
        numberTwo = teclado.nextInt();
        numberThree = teclado.nextInt();
        numberFour = teclado.nextInt();
        suma = numberOne + numberTwo + numberThree + numberFour;
        promedio = suma / 4; 
        
        System.out.println("La suma de los numero es: " + suma + " y el promedio es: " + promedio);
    }
}
