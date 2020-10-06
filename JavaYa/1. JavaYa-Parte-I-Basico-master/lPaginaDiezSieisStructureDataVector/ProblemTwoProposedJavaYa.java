package lPaginaDiezSeisStructureDataVector;

import java.util.*;

public class ProblemTwoProposedJavaYa {
   private Scanner teclado;
    private int[] vec1;
    private int[] vec2;
    private int[] vecSuma;
    
    public void cargar() {
        teclado=new Scanner(System.in);
        vec1=new int[4];
        vec2=new int[4];
        System.out.println("Carga del primer vector.");
        for(int f=0;f<4;f++) {
            System.out.print("Ingrese elemento:");
            vec1[f]=teclado.nextInt();
        }
        System.out.println("Carga del segundo vector.");
        for(int f=0;f<4;f++) {
            System.out.print("Ingrese elemento:");
            vec2[f]=teclado.nextInt();
        }        
    }    
    
    public void sumarizarVectores() {
    	vecSuma=new int[4];
        for(int f=0;f<4;f++) {
            vecSuma[f]=vec1[f]+vec2[f];
        }
        System.out.println("Vector resultante.");
        for(int f=0;f<4;f++) {
            System.out.println(vecSuma[f]);
        }
    }
    
    public static void main(String[] ar) {
        ProblemTwoProposedJavaYa pv = new ProblemTwoProposedJavaYa();
        pv.cargar();
        pv.sumarizarVectores();
    }      
}
