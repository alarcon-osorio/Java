package PaginaSeisSecuency;

import java.util.Scanner;

public class ProblemFour {
    public static void main(String[] args){
        double precio, total;
        int cantidad;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto");         
        precio = teclado.nextDouble();
        
        System.out.println("Ingrese la cantidad a llevar");
        cantidad = teclado.nextInt();
        
        total = precio * cantidad;
        
        System.out.println("El total a pagar es: " + total);
        
        
    }
}
