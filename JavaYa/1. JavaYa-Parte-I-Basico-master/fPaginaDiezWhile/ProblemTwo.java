package PaginaDiezWhile;

import java.util.*;

public class ProblemTwo {
    public static void main(String[] args) {
        int num;
        int x = 1;
        Scanner teclado = new Scanner(System.in);
       
        System.out.print("Ingrese un numero: ");
        num = teclado.nextInt();
        
        while(x <= num){
            System.out.println(x);
            x += 1;
        }
    }
}
