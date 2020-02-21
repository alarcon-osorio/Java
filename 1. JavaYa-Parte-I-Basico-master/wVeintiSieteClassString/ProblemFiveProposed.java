package wVeintiSieteClassString;

import java.util.*;

public class ProblemFiveProposed {
    private Scanner teclado;
    private String oracion;
    
    
    public ProblemFiveProposed(){
        teclado = new Scanner(System.in);
        System.out.print("Ingresa la oración: ");
        oracion = teclado.nextLine();
    }
    
    public void imprimirResultado(){
        for (int i = 0; i < oracion.length(); i++) {
            if (oracion.charAt(i) == ' ') {
                System.out.println();
            }else{
                System.out.print(oracion.charAt(i));
            }  
        }
        System.out.println();
        
    }
    
    public static void main(String[] args) {
        ProblemFiveProposed pfp = new ProblemFiveProposed();
        pfp.imprimirResultado();
    }
}
