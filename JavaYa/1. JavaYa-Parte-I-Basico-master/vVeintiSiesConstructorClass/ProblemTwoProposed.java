package vVeintiSiesConstructorClass;

import java.util.*;

public class ProblemTwoProposed {
    private Scanner teclado;
    int valor1, valor2;
    
    public ProblemTwoProposed(){
        teclado = new Scanner(System.in);
        System.out.println("Ingrese valores: ");
        valor1 = teclado.nextInt();
        valor2 = teclado.nextInt();
    }
    
    public void suma(){
        int suma = valor1 + valor2;
        System.out.println("Suma: " + suma);
    }
    
    public void resta(){
        int resta = valor1 - valor2;
        System.out.println("Resta: " + resta);
    }
    
    public void multiplicacion(){
        int multiplicacion = valor1 * valor2;
        System.out.println("Multiplicacion: " + multiplicacion);
    }
    
    public void division(){
        int division = valor1 / valor2;
        System.out.println("Division: " + division);
    }
    
    public static void main(String[] args) {
        ProblemTwoProposed ptp = new ProblemTwoProposed();
        ptp.suma();
        ptp.resta();
        ptp.multiplicacion();
        ptp.division();
    }
}
