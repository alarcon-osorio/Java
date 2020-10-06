package rPaginaVeintiDosStructureDataTypeMatrix;

import java.util.*;

public class ProblemOne {
    private Scanner teclado;
    private int[][] mat;
    private int contador;
    
    public void cargar(){
        teclado = new Scanner(System.in);
        mat = new int[3][5];
        contador = 0;
        for (int i = 0; i <3; i++) {
            contador += 1;
            for (int j = 0; j < 5; j++) {
                System.out.print("Ingrese Componenente " + contador + ": ");
                mat[i][j] = teclado.nextInt();
            }
        }    
    }
    
    public void imprimir(){
        System.out.println("La matriz se compone de: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(mat[i][j] + "+");
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        ProblemOne po = new ProblemOne();
        po.cargar();
        po.imprimir();
    }
 
}
