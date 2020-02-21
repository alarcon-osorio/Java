package PaginaCuatroCinco;

import java.util.Scanner;


public class PaginaCinco {
    public static void main(String[] args){
        int lado;
        int superficie;

        Scanner teclado = new Scanner(System.in);
        System.out.println("calcular la superficie de un cuadrado");
        
        System.out.println("Ingrese la medida de los lados: ");
        lado = teclado.nextInt();

        superficie = lado * lado;
        System.out.println("El valor de la supersicie es: " + superficie);
            
    
    }
    
}
