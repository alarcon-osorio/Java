package azteca;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class StringHelper {

    public static String[] uniqueStrings(String[] arr1, String[] arr2) implements uniqueStrings{
         public void uniqueStrings(){
            System.out.println(arr1 + arr2);
        }
    }

    public static int countString(String text, String strToCount) implements countString{
        public void uniqueStrings(){
            System.out.println(text + strToCount);
        }
    }

    public static void main(String[] args) {
        String[] names1 = new String[] {"Ana", "Pedro", "Diego", "Pablo"};
        String[] names2 = new String[] {"Daniel", "Pablo", "Ana", "Maria"};
        System.out.println(String.join(", ", StringHelper.uniqueStrings(names1, names2))); // deberia imprimir: Ana, Pedro, Diego, Pablo, Daniel, Maria

        String text = "El veloz murciélago hindú comía feliz cardillo y kiwi.";
        System.out.println(StringHelper.countString(text, "o")); // deberia imprimir: 4

    }

}

class uniqueStrings implements uniqueStrings  {
    public void actionPerformed(ActionEvent e){
        int contador = 1;
        Date date = new Date(); //Solo importar la clase, se almacena la hora y fecha actual
        System.out.println("La hora cada " +  contador  + " segundos " + date);
        //Video 53 - Clases Internas I
        Toolkit.getDefaultToolkit().beep();  //Video 53 - Clases Internas I --- Hace el sonido defecto de Windows
    }

}
