package wVeintiSieteClassString;

import java.util.Scanner;

public class ProblemThreeProposedJavaYa{
    private Scanner teclado;
    private String clave;
    
    public ProblemThreeProposedJavaYa() {
        teclado=new Scanner(System.in);
        System.out.print("Ingrese clave:");
        clave=teclado.nextLine();
    }
    
    public void verificarClave() {
        if (clave.equals("123abc")== true) {
            System.out.println("Se ingresó la clave en forma correcta");
        } else {
            System.out.println("No se ingresó la clave en forma correcta");        	
        }       
    }
    
    public static void main(String[] ar) {
        ProblemThreeProposedJavaYa cad = new ProblemThreeProposedJavaYa();
        cad.verificarClave();
    }
}