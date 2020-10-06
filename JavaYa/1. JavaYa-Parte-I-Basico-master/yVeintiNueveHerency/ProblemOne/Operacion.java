package yVeintiNueveHerency.ProblemOne;

import java.util.*;

public class Operacion {
    protected Scanner teclado;
    protected int valor1, valor2, resultado;
    
    public Operacion() { // CONSTRUCTOR AUTOMATIC
        teclado = new Scanner(System.in);
    }
    
    public void cargar1() {
        System.out.print("Ingrese valor 1: ");
        valor1 = teclado.nextInt();
    }
    
    public void cargar2() {
        System.out.print("Ingrese valor 2: ");
        valor2 = teclado.nextInt();
    }
    
    public void mostrarResultado() {
        System.out.println(resultado);
    }    
}
