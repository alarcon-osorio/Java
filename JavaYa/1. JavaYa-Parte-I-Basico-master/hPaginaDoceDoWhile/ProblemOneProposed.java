package PaginaDoceDoWhile;

import java.util.*;
public class ProblemOneProposed {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor, suma, cont;
        suma = 0;
        cont = 0;       
        
        do {
            cont += 1;
            System.out.println("Ingresar valor " + cont);
            valor = teclado.nextInt();
            if (valor >0 && valor < 9999) {
                suma += valor;            
            }
        } while (valor!=9999);
        System.out.println("La suma es:" + suma);
    }
}
