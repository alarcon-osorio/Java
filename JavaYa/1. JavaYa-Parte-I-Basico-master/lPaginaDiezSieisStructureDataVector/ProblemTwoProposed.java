
package lPaginaDiezSeisStructureDataVector;

import java.util.*;

public class ProblemTwoProposed {
    private Scanner teclado;
    int[] vector1, vector2, vector3;
    int suma1, suma2, suma3;
    public void carga(){
        teclado = new Scanner(System.in);
        vector1 = new int[4];
        vector2 = new int[4];   
    }
    
    public void valoresVector1(){
        System.out.println("Valores Vector 1");
        int conteo = 0;
        suma1 = 0;
        for (int i = 0; i < 4; i++) {
            conteo += 1;
            System.out.print("Ingrese valor " + conteo + " del vector 1: ");
            vector1[i] = teclado.nextInt();
            suma1 += vector1[i];
        }
        System.out.println("La suma total del vector 1 es: " + suma1);
    }
    
    public void valoresVector2(){
        System.out.println("Valores Vector 2");
        int conteo = 0;
        suma2 = 0;
        for (int i = 0; i < 4; i++) {
            conteo += 1;
            System.out.print("Ingrese valor " + conteo + " del vector 2: ");
            vector2[i] = teclado.nextInt();
            suma2 += vector2[i];
        }
        
        System.out.println("La suma total del vector 2 es: " + suma2);
    }
    
    public void vectorSuma(){
        suma3 = 0;
        System.out.println("La suma de los dos vectores en paralelo: ");
        for (int i = 0; i < 4; i++) {
            suma3 = vector1[i] + vector2[i];
            System.out.println("Vector1 + Vector2 = " + suma3);
        }
        
    }
    
    
    
    
    public static void main(String[] args) {
        ProblemTwoProposed vectores = new ProblemTwoProposed();
        vectores.carga();
        vectores.valoresVector1();
        vectores.valoresVector2();
        vectores.vectorSuma();
    }
    
}
