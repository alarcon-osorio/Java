package PaginaTreceStringChar;

import java.util.Scanner;

public class ProblemTwo {
    public static void main(String[] args) {
        String ape1, ape2;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingresar Apellido 1: ");
        ape1 = teclado.nextLine();
        
        System.out.println("Ingresar Apellido 2: ");
        ape2 = teclado.nextLine();
        
        if (ape1.equals(ape2)) { 
            /*
            Para comparar si el contenido de dos String son iguales no podemos
            utilizar el operador ==. Debemos utilizar un método de la clase 
            String llamado equals y pasar como parámetro el String con el que 
            queremos compararlo:
            if (apellido1.equals(apellido2)) {Statement ...}             
            equalsIgnoreCase: SensitiveCase
            */
            System.out.println("Son iguales");
        }else{
            System.out.println("Son diferentes");
        }       
    }
}
