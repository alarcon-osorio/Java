package PaginaNueveIF;

import java.util.*;

public class ProblemGeneralOne {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner teclado = new Scanner(System.in);        
        
        System.out.println("Ingrese e numero 1");
        num1 = teclado.nextInt();
        
        System.out.println("Ingrese e numero 2");
        num2 = teclado.nextInt();
        
        System.out.println("Ingrese e numero 3");
        num3 = teclado.nextInt();       
        
        if(num1 > num2 && num1 > num3){
            System.out.println("El primer dato es mayor: " + num1);
        }else if(num2 > num1 && num2 > num3){
                System.out.println("El segundo dato es mayor: " + num2);
        }else{
            System.out.println("El tercer dato es mayor: " + num3);
        }
    }
}

