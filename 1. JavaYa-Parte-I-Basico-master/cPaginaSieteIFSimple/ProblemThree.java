package PaginaSieteIFSimple;

import java.util.Scanner;

public class ProblemThree {
     public static void main(String[] args){
         int number;
         Scanner teclado = new Scanner(System.in);
         
         System.out.println("Ingrese un numero positivo de 1...99 para saber su cantidad de digitos");
         number = teclado.nextInt();
         
         if(number >= 0 && number <= 9){
             System.out.println("El numero " + number + " es de un solo digito");
         }else if(number >= 10 && number <= 99){
             System.out.println("El numero "  + number + " es de dos digitos");
         }else if(number < 0){
             System.out.println("El numero ingresado " + number + " No puede ser negativo");
         }else{
             System.out.println("Numero " + number + " Invalido");
         }
     }
}
