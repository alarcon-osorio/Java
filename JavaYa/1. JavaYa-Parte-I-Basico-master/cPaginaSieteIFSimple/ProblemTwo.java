package PaginaSieteIFSimple;

import java.util.Scanner;

public class ProblemTwo {
    public static void main(String[] args){
       int nota1, nota2, nota3, promedio;
        
       Scanner teclado = new Scanner(System.in);
       
       System.out.println("Ingrese las notas del alumno recuerde que no deben superar maxima calificación 10");
       System.out.println("Ingrese Primer nota");
       nota1 = teclado.nextInt();
       
       System.out.println("Ingrese Segunda nota");
       nota2 = teclado.nextInt();
       
       System.out.println("Ingrese Tercer nota");
       nota3 = teclado.nextInt();
       
       
       promedio = (nota1 + nota2 + nota3) / 3;
       
       if(promedio >= 7){
           System.out.println("La nota definitiva es: " + promedio + " Promocionado");
       }else{
           System.out.println("La nota definitiva es: " + promedio + " NO Promocionado");
       }
       
       
    }
    
}
