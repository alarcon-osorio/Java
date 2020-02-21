package PaginaSieteIFSimple;

import java.io.*;

public class ProblemOne {
     public static void main(String[] args)throws IOException{             
         BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
         
         int num1, num2, suma, diferencia, producto, division;
         
         System.out.println("Ingrese el primer numero: ");
         num1 = Integer.parseInt(teclado.readLine());
         
         System.out.println("Ingrese el segundo numero: ");
         num2 = Integer.parseInt(teclado.readLine());
         
         suma = num1 + num2;
         diferencia =  num1 - num2;
         producto =  num1 * num2;
         division =  num1 / num2;
         
         if(num1 > num2){
             System.out.println("El numero mayor es el primero por tanto la suma de los dos numero es: " + suma + " y la diferencia es " + diferencia);
         }else{
             System.out.println("El numero mayor es el segundo por tanto el producto de los dos numero es: " + producto + " y la division es " + division);
         }
     }
}
