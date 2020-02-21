package PaginaQuinceMethods;
 
import java.util.*;
public class ProblemTwo {
    public void inicializar(){
        Scanner teclado = new Scanner(System.in);
        int n_enviado1, n_enviado2, n_enviado3, mayor, menor;
        System.out.println("Ingrese numero 1: ");
        n_enviado1 = teclado.nextInt();
        
        System.out.println("Ingrese numero 2: ");
        n_enviado2 = teclado.nextInt();
        
        System.out.println("Ingrese numero 3: ");
        n_enviado3 = teclado.nextInt();
        
        mayor = pasoDeParametrosMayor(n_enviado1, n_enviado2, n_enviado3);
        menor = pasoDeParametrosMenor(n_enviado1, n_enviado2, n_enviado3);
        
        System.out.println("El numero mayor " + mayor);
        System.out.println("El numero menor " + menor);
        
    }
    
    public int pasoDeParametrosMayor(int n_recibido1, int n_recibido2, int n_recibido3){
        int m;
        if (n_recibido1 > n_recibido2 && n_recibido1 > n_recibido3) {
            m = n_recibido1;
        }else{
            if(n_recibido2 > n_recibido3){
                m = n_recibido2;
            }else{
                m = n_recibido3;
            }
        }
        return m;
    }
    
    public int pasoDeParametrosMenor(int n_recibido1,  int n_recibido2, int n_recibido3){
        int m;
        if (n_recibido1 < n_recibido2 && n_recibido1 < n_recibido3) {
            m = n_recibido1;
        }else{
            if (n_recibido2 < n_recibido3) {
                m = n_recibido2;
            }else{
                m = n_recibido3;
            }
        }
        return m;
    }
    
    public static void main(String[] args) {
        ProblemTwo maymen = new ProblemTwo();
        maymen.inicializar();
    }
    
}
