package PaginaSieteIFSimple;

import java.util.Scanner;

public class ProblemPrincipalTwo {
     public static void main(String[] args){
         int num1, num2;
         
         Scanner teclado = new Scanner(System.in);
         
         System.out.println("Ingrese el primer numero: ");
         num1 = teclado.nextInt();
         
         System.out.println("Ingrese el segundo numero: ");
         num2 = teclado.nextInt();
         
         if(num1 > num2){
            System.out.println("El mayor es " + num1);
         }else{
            System.out.println("El mayor es " + num2);
         }
         
     }
}
