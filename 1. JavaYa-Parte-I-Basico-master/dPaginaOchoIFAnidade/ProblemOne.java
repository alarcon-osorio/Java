package PaginaOchoIFAnidade;

import java.util.Scanner;

/*public class ProblemOne {
    public static void main(String[] args){
        int num1, num2, num3;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese tres numeros: ");
        num1 = teclado.nextInt();
        num2 = teclado.nextInt();
        num3 = teclado.nextInt();
        
        if(num1 > num2 && num1 > num3){
            System.out.println("Primer numero mayor al resto");
        }else if(num2 > num1 && num2 > num3){
            System.out.println("Segundo numero mayor al resto");            
        }else{
            System.out.println("Tercer numero mayor al resto");
        }        
        
    }
}*/


import java.util.Scanner;

public class ProblemOne {
    public static void main(String[] ar) {
        Scanner teclado=new Scanner(System.in);
        int num1,num2,num3;
        System.out.print("Ingrese primer valor:");
        num1=teclado.nextInt();
        System.out.print("Ingrese segunda valor:");
        num2=teclado.nextInt();
        System.out.print("Ingrese tercer valor:");
        num3=teclado.nextInt();
        if (num1>num2) {
            if (num1>num3) {
                System.out.print(num1);
            } else {
                System.out.println(num3);
            }
        } else {
            if (num2>num3) {
                System.out.print(num2);
            } else {
                System.out.print(num3);
            }
        }
    }
}
