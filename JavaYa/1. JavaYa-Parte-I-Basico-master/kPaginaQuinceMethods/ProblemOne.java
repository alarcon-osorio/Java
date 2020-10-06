package PaginaQuinceMethods;

import java.util.*;

public class ProblemOne {
    public void inicializar(){
        Scanner teclado = new Scanner(System.in);
        int valor;
        do {            
            System.out.println("Ingrese valor: ");
            valor = teclado.nextInt();
            if (valor != -1) {
                tablaMultiplicar(valor);
            }    
        } while (valor != -1); //Se ejecuta mientras el valor sea diferente a -1 si es == -1 muere
          
    }
    
    public void tablaMultiplicar(int valorRecibido){
        int contador = 0;
        for (int i=valorRecibido; i<valorRecibido*10; i+=valorRecibido) {
            contador += 1;
            System.out.println(valorRecibido + " X " + contador + " = " + i);
        }
    }   
    
    public static void main(String[] args) {
        ProblemOne tabla = new ProblemOne();
        tabla.inicializar();
    }
}
