package lPaginaDiezSeisStructureDataVector;

import java.util.*;
public class ProblemOne {
    private Scanner teclado;
    private int[] sueldos;
    
    public void cargar(){
        teclado = new Scanner(System.in);        
        sueldos = new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrse el valor del componente: ");
            sueldos[i] = teclado.nextInt();            
        }      
    }
    
    public void imprimir(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Componenete: " + sueldos[i]);            
        }
    }
    
    public static void main(String[] args) {
        ProblemOne vector = new ProblemOne();
        vector.cargar();
        vector.imprimir();
    }
    
}
