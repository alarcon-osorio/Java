package wVeintiSieteClassString;

import java.util.*;

public class ProblemThreeProposed {
    private Scanner teclado;
    private String password;
    
    public ProblemThreeProposed(){
        teclado = new Scanner(System.in);
        System.out.print("Ingrese Password: ");
        password = teclado.nextLine();
    }
    
    public void verificarClave(){
        String compare = "123abc";
        if (password.compareTo(compare) == 0) {
            System.out.println(password + " SI Concuerda con el solicitado PUEDE SEGUIR");
        }else{
            System.out.println(password + " NO Concuerda con el solicitado INTENTE NUEVAMENTE " + compare);
        }
    }
    
    
    public static void main(String[] args) {
        ProblemThreeProposed ptp = new ProblemThreeProposed();
        ptp.verificarClave();
    }
}
