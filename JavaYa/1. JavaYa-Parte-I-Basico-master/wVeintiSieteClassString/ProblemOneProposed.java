package wVeintiSieteClassString;

import java.util.*;

public class ProblemOneProposed {
    private Scanner teclado;
    private String email;
        
    public ProblemOneProposed(){
        teclado = new Scanner(System.in);
        System.out.print("Ingresar E-mail: ");
        email = teclado.nextLine();
    }
    
    public void imprimirResultado(){
        boolean existe = false;
        for (int i = 0; i < email.length(); i++) {
           if(email.charAt(i) == '@'){
               existe = true;
           }
        }
        
        if (existe == true) {
            System.out.println(email + " SI contiene @ la validación es OK");
        }else{
            System.out.println(email + " NO contiene @ por favor verificar");
        }
    }
    
    public static void main(String[] args) {
        ProblemOneProposed pop = new ProblemOneProposed();
        pop.imprimirResultado();
    }
}
