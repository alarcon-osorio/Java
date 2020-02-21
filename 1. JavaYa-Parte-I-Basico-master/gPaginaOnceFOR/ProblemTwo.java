package PaginaOnceFOR;

import java.util.*;
public class ProblemTwo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int suma, valor, promedio;
        
        suma= 0;
        valor= 0;        
        
        for (int i = 1; i <= 10; i++) {
           System.out.println("Ingrese el valor " + i); 
           valor = teclado.nextInt();
           suma += valor;
        }
        promedio = suma/10;
        System.out.println("La suma de los valores es: " + suma);
        System.out.println("El promedio de los valores es: " + promedio);
    }
}
