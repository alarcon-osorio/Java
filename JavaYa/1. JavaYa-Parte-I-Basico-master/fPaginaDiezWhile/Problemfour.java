package PaginaDiezWhile;

import java.util.*;

public class Problemfour {
    public static void main(String[] args) {
        int x = 1;
        int cantidad = 1;
        int n;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de piezas: ");       
        n = teclado.nextInt();
        
        while(x <= n){
            float largo;
            System.out.println("Ingrese el largo de las pieza: " + cantidad);
            largo = teclado.nextFloat();
            //Cuando digitamos el valor de la pieza en el Output de JAVA debe ser con coma ya que es FLOAT
            if(largo >= 1.20 && largo <= 1.30){
                cantidad += 1;  
            }
            x += 1; //Tener en cuenta que el x += 1 debe estar dentro del while para que se repita el conteo de n
                       
        }
        
        System.out.println("Cantidad de piezas validas son: " + (cantidad -1));
    }  
        
}
