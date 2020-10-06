package PaginaOnceFOR;

import java.util.Scanner;

public class ProblemFive {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cantidad, n, valor, suma;
        
        cantidad = 0;
        suma = 0;
        
        System.out.println("Ingresa el numero de transacciones");
        n = teclado.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.println("Ingresa el valor " + i);
            valor = teclado.nextInt();
            
            if (valor >= 1000) {
                cantidad += 1;                
            }
            suma += valor;
        }
        System.out.println("La cantidad de transacciones que superan 1000 fueron: " + cantidad);
        System.out.println("La suma de las cantidades fue: " + suma);
    }
 
}
