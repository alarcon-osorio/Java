package PaginaDoceDoWhile;

import java.util.Scanner;

public class ProblemOne {
    public static void main(String[] args) {
        int valor;        
        Scanner teclado = new Scanner(System.in);
        
        do{
            System.out.println("Ingrese valor entre 0 y 999");
            valor = teclado.nextInt();
            if (valor >= 100) {
                System.out.println("El numero tiene  3 digitos o mas");
            }else{
                if (valor >= 10) {
                    System.out.println("El numero tiene 2 Digitos");
                }else{
                    System.out.println("El numero tiene 1 Digito");
                }
            }        
        }while(valor!=0);               
    }
}
