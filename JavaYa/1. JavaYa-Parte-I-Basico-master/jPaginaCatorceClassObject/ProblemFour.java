package PaginaCatorceObjectsClass;

import java.util.*;

public class ProblemFour {
    private Scanner teclado;
    private int lado;
    
    public void inicializar(){
        teclado = new Scanner(System.in);
        System.out.println("Cargue el valor del lado del cuadrado");
        lado = teclado.nextInt();
    }
    
    public void calcularPerimetro(){
        int perimetro;
        perimetro = lado * 4;  
        System.out.println("El perimetro del cuadrado es: " + perimetro);        
    }
    
    public void calcularSuperficie(){
        int superficie;
        superficie = lado * lado;
        System.out.println("La superficie del cuadrado es: " + superficie);
    }
    
    public static void main(String[] args) {
        ProblemFour cuadrado = new ProblemFour();
        cuadrado.inicializar();
        cuadrado.calcularPerimetro();
        cuadrado.calcularSuperficie();
    }
}
