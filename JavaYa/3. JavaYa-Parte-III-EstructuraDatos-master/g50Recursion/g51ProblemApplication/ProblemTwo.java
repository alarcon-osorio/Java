package g50Recursion.g51ProblemApplication;

import java.io.File;

public class ProblemTwo {
    
   public void leer(String inicio, String altura) {
       File ar = new File(inicio);
       String [] dir = ar.list();
       for (int i = 0; i < dir.length; i++) {
           File ar2 = new File(inicio + dir[i]);
           if (ar.isFile())
               System.out.println(altura + dir[i]);
           if (ar2.isDirectory()) {
               System.out.println(altura + "Directorio: " + dir[i].toUpperCase());
               leer(inicio+dir[i] + "\\", altura + " ");
           }
       }
   }
   
    public static void main(String[] args) {
        ProblemTwo pt = new ProblemTwo();
        pt.leer("d:\\windows\\" , "");
    }
}
