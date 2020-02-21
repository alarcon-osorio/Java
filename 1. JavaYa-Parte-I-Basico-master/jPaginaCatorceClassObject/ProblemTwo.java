package PaginaCatorceClassObject;

import java.util.*;

public class ProblemTwo {
    private int lado1, lado2, lado3;
    private Scanner teclado;
    
    
    public  void inicializar(){
        teclado = new Scanner(System.in);
        System.out.print("Ingrese lado numero 1: ");
        lado1 = teclado.nextInt();
        
        System.out.print("Ingrese lado numero 2: ");
        lado2 = teclado.nextInt();
        
        System.out.print("Ingrese lado numero 3: ");
        lado3 = teclado.nextInt();        
    }
    
    public void imprimirMayor(){
        
        System.out.print("Lado mayor:");
        if (lado1>lado2 && lado1>lado3) {
            System.out.println(lado1);
        } else {
            if (lado2>lado3) {
                System.out.println(lado2);
            } else {
                System.out.println(lado3);
            }
        }
        
        //FORMA 2 == SUJETA A VALIDAR YA QUE NO ES EFICIENTE EL SI
        if (lado1 > lado2 && lado1 > lado3) {
            System.out.println("El lado de mayor medida es lado Numero 1");
        }else{
            if(lado2 > lado3){            
               System.out.println("El lado de mayor medida es lado Numero 2");
            }else{
            System.out.println("El lado de mayor medida es lado Numero 3");
            }
        }
    }   
        
    public void esEquilatero(){
        if (lado1 == lado2 && lado1 == lado3) {
            System.out.println("El triangulo es equilatero");
        }else{
            System.out.println("El triangulo NO es equilatero");
        }
    }
    
    public static void main(String[] args) {
       ProblemTwo triangulo = new ProblemTwo();
       triangulo.inicializar();
       triangulo.imprimirMayor();
       triangulo.esEquilatero();
    }
    
    
}
