package tVeintiCuatroMatrixVectorParalels;

import java.util.Scanner;

public class ProblemOneProposedJavaYa {
    private Scanner teclado;
    private String[] paises;
    private int[][] tempmen;
    private int[] temptri;
    
    public void cargar() {
        teclado=new Scanner(System.in);
        paises=new String[4];
        tempmen=new int[4][3];
        for(int f=0;f<paises.length;f++){
            System.out.print("Ingrese el nombre del país:");
            paises[f]=teclado.next();
            for(int c=0;c<tempmen[f].length;c++) {
                System.out.print("Ingrese temperatura mensual:");
                tempmen[f][c]=teclado.nextInt();
            }
        }
    }
    
    public void imprimirTempMensuales() {
        for(int f=0;f<paises.length;f++){
        	System.out.print("Pais:" + paises[f]+":");
            for(int c=0;c<tempmen[f].length;c++) {
                System.out.print(tempmen[f][c]+" ");
            }
            System.out.println();
        }    
    }
    
    public void calcularTemperaturaTri() {
        temptri=new int[4];	
        for(int f=0;f<tempmen.length;f++) {
            int suma=0;
            for(int c=0;c<tempmen[f].length;c++) {
                suma=suma+tempmen[f][c];
            }
            temptri[f]=suma/3;
        }
    }
    
    public void imprimirTempTrimestrales() {
        System.out.println("Temperaturas trimestrales.");
        for(int f=0;f<paises.length;f++) {
            System.out.println(paises[f]+" "+temptri[f]);
        }
    }
    
    public void paisMayorTemperaturaTri() {
       int may=temptri[0];
       String nom=paises[0];
       for(int f=0;f<paises.length;f++) {
           if (temptri[f]>may) {
               may=temptri[f];
               nom=paises[f];
           }
       }
       System.out.println("Pais con temperatura trimestral mayor es "+ nom + " que tiene una temperatura de "+may);        
    }
        
    public static void main(String[] ar){
        ProblemOneProposedJavaYa ma = new ProblemOneProposedJavaYa();
        ma.cargar();
        ma.imprimirTempMensuales();
        ma.calcularTemperaturaTri();
        ma.imprimirTempTrimestrales();
        ma.paisMayorTemperaturaTri();
    }
}