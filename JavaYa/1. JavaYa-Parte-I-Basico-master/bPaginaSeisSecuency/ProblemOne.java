package PaginaSeisSecuency;

import java.io.IOException;
import java.util.Scanner;

public class ProblemOne {
    public static void main(String[] args)throws IOException{
        int lado, perimetro;
        System.out.println("Ingrese el lado del cuadrado");
        Scanner teclado = new Scanner(System.in);
        lado = teclado.nextInt();
        
        perimetro = lado * 4;
        
        System.out.println("El perimetro del cuadrado es: " + perimetro);
    }
}
