package qPaginaVientiUnoOrderParalelVectors;

import java.util.*;

public class ProblemOne {
    private Scanner teclado;
    private String[] alumnos;
    private int[] notas;
    private int cantidad, contador;
    
    public void cargar(){
        teclado = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de alumnos: ");
        cantidad = teclado.nextInt();
        alumnos = new String[cantidad];
        notas = new int[cantidad];
        contador = 0;
        for (int i = 0; i < cantidad; i++) {
            contador += 1;
            System.out.print("Ingrese nombre alumno " + contador + ": ");
            alumnos[i] = teclado.next();
            System.out.print("Ingrese su nota: ");
            notas[i] = teclado.nextInt();
        }
    }
    
    public void ordenar(){
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas.length - 1 - i; j++) {
                if (notas[j] < notas[j+1]) { //Mayor a menor <
                    int aux;
                    aux = notas[j];
                    notas[j] = notas[j+1];
                    notas[j+1] = aux;
                    
                    String auxnombre;
                    auxnombre = alumnos[j];
                    alumnos[j]=alumnos[j+1];
                    alumnos[j+1]=auxnombre;
                }
            }
        }
    }
    
    public void imprimir(){
        System.out.println("----------------------------");
        System.out.println("Notas ingresadas y organizadas");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("El alumno " + alumnos[i] + " obtuvo la nota " + notas[i]);
        }
    }
    
    
    public static void main(String[] args) {
        ProblemOne po = new ProblemOne();
        po.cargar();
        po.ordenar();
        po.imprimir();
    }
    
}
