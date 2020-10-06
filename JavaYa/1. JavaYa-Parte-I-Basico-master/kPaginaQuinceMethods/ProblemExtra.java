package PaginaQuinceMethods;

import java.util.*;

public class ProblemExtra {   
    private void procedimiento(int n, String nombre, String profesion){        
        Scanner teclado =  new Scanner(System.in);
        System.out.println("Ingrese Nombre: ");
        nombre = teclado.nextLine();
        
        System.out.println("Ingrese Ocapación: ");
        profesion = teclado.nextLine();
        n += 1;
        if(n > 0 && !nombre.equals("")){
            System.out.println("Nombre: " + nombre);
            System.out.println("Respetado: " + profesion);
            return; //Si no ponemos este return se mostraría hola y luego adiós
        }
    //También podríamos usar un else en vez del return
    System.out.println("No ingreso datos");
}
    
    public static void main(String[] args) {
        ProblemExtra prueba = new ProblemExtra();
        prueba.procedimiento(0, "", "");
    }  
    
}
