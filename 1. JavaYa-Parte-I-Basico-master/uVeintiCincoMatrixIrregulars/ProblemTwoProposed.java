package uVeintiCincoMatrixIrregulars;

import java.util.*;

public class ProblemTwoProposed {
    private Scanner teclado;
    private String[] empleados;
    private int[][] matrix;
    private int cantidad_emp, contador, filas, columnas;
    
    public void cargar(){
        teclado = new Scanner(System.in);
        System.out.print("Ingresar cantidad de empleados: ");
        cantidad_emp = teclado.nextInt();
        empleados = new String[cantidad_emp];
        matrix = new int[cantidad_emp][];
    }
    
    public void empleados(){
        contador = 0; 
        for (int i = 0; i < empleados.length; i++) {           
            contador += 1;
            System.out.print("Ingrese nombre empleado " + contador + ": ");
            empleados[i] = teclado.next();
            System.out.print("Cuantos dias falto " + empleados[i] + ": ");
            filas = teclado.nextInt();            
            matrix[i] = new int[filas];
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Ingrese fecha en que falto: ");
                matrix[i][j] = teclado.nextInt();
            }          
        }    
    }
    
    public void imprimir(){       
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(empleados[i] + " falto " + matrix[i].length + " dias, en las fechas: ");
            int suma_length = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                suma_length += matrix.length;
                //System.out.println(suma_length);
                if (suma_length >= 4) {
                   System.out.print(matrix[i][j] + " ");  
                }else{
                    System.out.print(matrix[i][j] + " ");
                }                
            }
            System.out.println();
        } 
    }
    
    public void menorFalta(){
        int faltas = matrix[0].length;
        String nombres = empleados[0];
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length < faltas) {
                faltas = matrix[i].length;
                nombres = empleados[i];
            }               
        }
        System.out.println("El empleado con menos falto es: " + nombres + " con un total de: " + faltas + " faltas");
    }
    
    public static void main(String[] args) {
        ProblemTwoProposed ptp = new ProblemTwoProposed();
        ptp.cargar();
        ptp.empleados();
        ptp.imprimir();
        ptp.menorFalta();
    }
}
