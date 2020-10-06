package PaginaOnceFOR;

import java.util.Scanner;

public class ProblemFour {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int multi5, multi3, valor;
        
        multi5 = 0;
        multi3 = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.println("Ingrese valor " + i);
            valor = teclado.nextInt();
            
            if ((valor%3) == 0) {
                multi3 += 1;
            }
            if ((valor%5) == 0) {
                multi5 += 1;
            }            
        }
        System.out.println("Cantidad de Multiplos de 3: " + multi3);
        System.out.println("Cantidad de Multiplos de 5: " + multi5);
    }
}
