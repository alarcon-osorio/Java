package qPaginaVientiUnoOrderParalelVectors;

import java.util.Scanner;

public class ProblemOneJavaYa  {
    private Scanner teclado;
    private String[] nombres;
    private int[] notas;
    
    public void cargar() {
        teclado=new Scanner(System.in);
        nombres=new String[5];
        notas=new int[5];
        System.out.println("Carga de nombres y notas");
        for(int f=0;f<nombres.length;f++) {
            System.out.print("Ingese el nombre del alumno:");
            nombres[f]=teclado.next();
            System.out.print("Ingrese la nota del alumno:");
            notas[f]=teclado.nextInt();
        }
    }        
    
    public void ordenar() {
        for(int k=0;k<notas.length;k++) {
            for(int f=0;f<notas.length-1-k;f++) {
                if (notas[f]<notas[f+1]) {
                    int auxnota;
                    auxnota=notas[f];
                    notas[f]=notas[f+1];
                    notas[f+1]=auxnota;
                    String auxnombre;
                    auxnombre=nombres[f];
                    nombres[f]=nombres[f+1];
                    nombres[f+1]=auxnombre;
                }
            }
        }
    }
        
    public void imprimir() {
   	System.out.println("Nombres de alumnos y notas de mayor a menor");
        for(int f=0;f<notas.length;f++) {
            System.out.println(nombres[f] + " - " + notas[f]);
        }
    }        

    public static void main(String[] ar) {
        ProblemOneJavaYa pv=new ProblemOneJavaYa();
        pv.cargar();
        pv.ordenar();
        pv.imprimir();
    }  	
}

