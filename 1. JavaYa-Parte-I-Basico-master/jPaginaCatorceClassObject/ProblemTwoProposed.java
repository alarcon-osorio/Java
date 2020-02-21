package PaginaCatorceObjectsClass;

import java.util.*;

public class ProblemTwoProposed {
    private Scanner teclado;
    private int num1, num2;
    private int suma, resta, multiplicacion;
    private float division;
    
    public void inicializar(){
        teclado = new Scanner(System.in);
        System.out.print("Ingrese Numero 1: ");
        num1 = teclado.nextInt();
        System.out.print("Ingrese Numero 2: ");
        num2 = teclado.nextInt();
    }
    
    public void suma(){        
        suma = num1 + num2;
        System.out.println("El resultado de la suma es: " + suma);
    }
    
    public void resta(){        
        resta = num1 - num2;
        System.out.println("El resultado de la resta es: " + resta);
    }
     
    public void multiplicacion(){
        multiplicacion = num1 * num2;
        System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
    }
    
    public void division(){        
        division = num1 / num2;
        System.out.println("El resultado de la division es: " + division);
    }
    
    public static void main(String[] args) {
        ProblemTwoProposed calc = new ProblemTwoProposed();
        calc.inicializar();
        calc.suma();
        calc.resta();
        calc.multiplicacion();
        calc.division();        
    }
}
