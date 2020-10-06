package PaginaDoceDoWhile;

import java.util.Scanner;

public class ProblemTwo {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int suma,cant,valor,promedio;
        suma=0;
        cant=0;
        do {
            System.out.print("Ingrese un valor (0 para finalizar): ");
            valor=teclado.nextInt();
            if (valor!=0) {
                suma=suma+valor;
                cant++;
            }
        } while (valor!=0);
        if (cant!=0) {
            promedio=suma/cant;
            System.out.println("El promedio de los valores ingresados es: " + promedio);
        } else {
            System.out.println("No se ingresaron valores.");
        }
    }
}
