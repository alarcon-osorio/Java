package nPaginaDiezOchoParalelsVectors;

import java.util.*;

public class ProblemOne {
    private Scanner teclado;
    private String[] nombres; 
    private int[] edades;
    private int cant, contador;
    
    public void cargar(){
        teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas");
        cant = teclado.nextInt();
        nombres = new String[cant];
        edades = new int[cant];
        contador = 0;
        for (int i = 0; i < cant; i++) {
            contador += 1;
            System.out.print("Ingrese el nombre de la persona " + contador + ": ");
            nombres[i] = teclado.next();
            System.out.print("Ingrese su edad: ");
            edades[i] = teclado.nextInt();
        }
    }
    
    public void imprimirNombresEdad(){
        contador = 0;
        for (int i = 0; i < cant; i++) {
            contador += 1;
            System.out.println("Nombre persona " + contador + ": " + nombres[i] + " Edad: " + edades[i] );             
        }
    }
    
    public void imprimirMayores(){
        for (int i = 0; i < cant; i++) {
            if (edades[i] >= 18) {
                System.out.println(nombres[i] + " de " +  edades[i] + " años es mayor" );
            }
        }
    }
    
    public static void main(String[] args) {
        ProblemOne nombresEdades = new ProblemOne();        
        nombresEdades.cargar();
        nombresEdades.imprimirNombresEdad();
        nombresEdades.imprimirMayores();
    }
    
}
