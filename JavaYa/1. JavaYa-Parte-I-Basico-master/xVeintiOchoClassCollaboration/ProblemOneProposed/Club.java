package xVeintiOchoClassCollaboration.ProblemOneProposed;

import java.util.*;

public class Club {
   private Scanner teclado;
   private Socio socio1, socio2, socio3;
   
   private Club() {
       teclado = new Scanner(System.in);
       socio1 = new Socio(teclado);
       socio2 = new Socio(teclado);
       socio3 = new Socio(teclado); 
    }
   
   public void listaSocios() {
       System.out.println(" ------------------------------------------------------- ");
       socio1.imprimirListaSocios();
       socio2.imprimirListaSocios();
       socio3.imprimirListaSocios();
   }
   
   public void masAntiguo() {
       if (socio1.retornaAntiguedad() > socio2.retornaAntiguedad() && socio1.retornaAntiguedad() > socio3.retornaAntiguedad()) {
           socio1.imprimir();           
       }else{
           if (socio2.retornaAntiguedad() > socio3.retornaAntiguedad()) {
               socio2.imprimir();  
           }else{
               socio3.imprimir(); 
           }
       }
   }
    
    public static void main(String[] args) {
        Club cl = new Club();
        cl.listaSocios();
        cl.masAntiguo();
    }
}
