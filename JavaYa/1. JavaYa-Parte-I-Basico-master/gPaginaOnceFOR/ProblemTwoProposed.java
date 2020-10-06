package PaginaOnceFOR;

import java.util.Scanner;

public class ProblemTwoProposed {
    public static void main(String[] args) {
        int numero, suma, valor;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de numeros que desea cargar");
        numero = teclado.nextInt();
        suma = 0;
        
        for (int i = 1; i <= numero; i++) {
            System.out.print("Ingrese el valor " + i + ": ");
            valor = teclado.nextInt();
            if (i >= 5) {
                suma += valor;
            }           
        }
        System.out.println("La suma de los ultimos 5 es: " + suma);
    }
}
