package lPaginaDiezSeisStructureDataVector;

import java.util.*;

public class ProblemThreeProposed {
    private Scanner teclado;
    private float[] notasA, notasB;
    private int contador;
    private float promedioA, promedioB, sumaA, sumaB;
    
    public void cargar(){
        teclado = new Scanner(System.in);
        notasA = new float[5];  
        notasB = new float[5];        
    }
    
    public void alumnosA(){
        System.out.println("Ingrese las notas de los Alumnos del curso A");
        contador = 0;
        for (int i = 0; i < 5; i++) {
            contador += 1;
            System.out.print("Nota Alumno " + contador + " Curso A: ");
            notasA[i] = teclado.nextFloat();
            sumaA += notasA[i];
        }   
        promedioA = sumaA/5;
        System.out.println("Promedio de notas Alumnos del Curso A: " + promedioA);
    }
    
    
    public void alumnosB(){
        System.out.println("Ingrese las notas de los Alumnos del curso B"); 
        contador = 0;
        for (int i = 0; i < 5; i++) {
            contador += 1;
            System.out.print("Nota Alumno " + contador + " Curso B: ");
            notasB[i] = teclado.nextFloat();
            sumaB +=  notasB[i];
        }  
        promedioB = sumaB/5;
        System.out.println("Promedio de notas Alumnos del Curso B: " + promedioB);
    }
    
    public void mayorPromedio(){
        if (promedioA > promedioB) {
            System.out.println("Los Alumnos de mayor promedio son los Alumnos del curso A");
        }else{
            if (promedioA == promedioB) {
              System.out.println("El promedio de los dos cursos es el mismo");
            }else{
                System.out.println("Los Alumnos de mayor promedio son los Alumnos del curso B");
            }
             
        }
    }   
    
    public static void main(String[] args) {
        ProblemThreeProposed notas = new ProblemThreeProposed();
        notas.cargar();
        notas.alumnosA();
        notas.alumnosB();
        notas.mayorPromedio();
    }
}
