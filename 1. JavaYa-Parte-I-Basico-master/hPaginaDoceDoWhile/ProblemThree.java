package PaginaDoceDoWhile;

import java.util.Scanner;

public class ProblemThree {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cant1, cant2, cant3, suma;
        float peso;
        cant1 = 0;
        cant2 = 0;
        cant3 = 0;
        
        do {
            System.out.println("Digite el peso: ");
            peso = teclado.nextFloat();
            if (peso > 10.2) {
                cant1++;
            }else{
                if (peso >= 9.2) {
                    cant2++;
                }else{
                    if (peso > 0) {
                        cant3++;
                    }
                }
            }
        } while (peso!=0);
        suma = cant1 + cant2 + cant3;
        System.out.println("Cantidad 1 = "  + cant1 + " Cantidad 2 = " + cant2 + " Cantidad 3 = " + cant3 + " La suma de todo es = " + suma);
    }
}
