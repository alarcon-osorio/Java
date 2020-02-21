package tVeintiCuatroMatrixVectorParalels;

import java.util.*;

public class ProblemOneProposed {
    private Scanner teclado;
    private String[] paises;
    private int[][] temperaturas;
    private int cantidad, contador, meses, suma, mayor;
    private int[] total;
    private String provincia;
    
    public void cargar(){
        teclado = new Scanner(System.in);
        System.out.print("Ingresar cantidad de paises: ");
        cantidad = teclado.nextInt();           
        paises = new String[cantidad];        
    }
    
    public void addPaises(){
        contador = 0; 
        for (int i = 0; i < cantidad; i++) {
            contador += 1;
            System.out.print("Ingrese nombre del pais " + contador + ": ");
            paises[i] = teclado.next();
        }
    }
    
    public void addTemperatura(){       
        System.out.println("---------------");
        System.out.print("Ingrese la cantidad de meses: ");
        meses = teclado.nextInt();
        temperaturas = new int[cantidad][meses];
        contador = 0;
        for (int i = 0; i < cantidad; i++) {            
            for (int j = 0; j < meses; j++) {
                contador += 1;
                System.out.print("Ingrese temperatura mes " + contador + " pais " + paises[i] + ": ");
                temperaturas[i][j] = teclado.nextInt();
            }            
        }
    }
    
    public void calcular(){
        total = new int[cantidad];
        for (int i = 0; i < temperaturas.length; i++) {
            suma = 0;
            for (int j = 0; j < temperaturas[i].length; j++) {
                suma += temperaturas[i][j];
            }            
            total[i] = suma;
        }
    }
    
    public void mayor(){
        mayor = total[0];
        provincia = paises[0];
        for (int i = 0; i < temperaturas.length; i++) {            
            if (total[i] > mayor) {
                mayor = total[i];
                provincia = paises[i];
            }            
        }
    }
    
    public void printData(){  
        System.out.println("---Resultados---");
        System.out.println("PAISES ---- TOTAL TEMP");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print(paises[i] + " ");
            for (int j = 0; j < temperaturas[i].length; j++) {
                System.out.print(temperaturas[i][j] + " ");
            }            
            System.out.print(total[i]);
            System.out.println();
        }
        System.out.println("El pais " + provincia + " tiene la mayor temperatura con " + mayor + "°");
    }
    
    public static void main(String[] args) {
        ProblemOneProposed pop = new ProblemOneProposed();
        pop.cargar();
        pop.addPaises();
        pop.addTemperatura();
        pop.calcular();
        pop.mayor();
        pop.printData();
    }    
}
