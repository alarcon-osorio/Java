package lPaginaDiezSeisStructureDataVector;

import java.util.*;

public class ProblemTwo {
    private Scanner teclado;
    private float[] alturas;
    private float promedio;
    private int contador;
    
    public void inicializar(){    
        teclado = new Scanner(System.in);
        alturas = new float[5];
        System.out.println("Ingrese alturas en decimales con coma");        
        contador = 0;        
        for (int i = 0; i < 5; i++) {
            contador += 1;
            System.out.print("Ingrese altura de la persona numero " + contador + ": ");
            alturas[i] = teclado.nextFloat();             
        }          
    }   
    
    public void imprimirPromedio(){
        float suma;
        suma = 0;
        for (int i = 0; i < 5; i++) {
            suma += alturas[i];  
        }
        promedio = suma / 5;
        System.out.println("El promedio de altura es: " + promedio);
            
   }
    
    public void imprimirCondicion(){
        int may, men;
        may = 0;
        men = 0;        
        for (int i = 0; i < 5; i++) {
            if (alturas[i] > promedio) {
                may ++;
            }else{
                if (alturas[i] < promedio) {
                    men ++;
                }
            }           
        }
        System.out.println("La cantidad de personas mas altas que el promedio son: " + may);
        System.out.println("La cantidad de personas mas bajas que el promedio son: " + men);
    }
    
    public static void main(String[] args) {
        ProblemTwo alturas = new ProblemTwo();
        alturas.inicializar();
        alturas.imprimirPromedio();
        alturas.imprimirCondicion();
    }
}
