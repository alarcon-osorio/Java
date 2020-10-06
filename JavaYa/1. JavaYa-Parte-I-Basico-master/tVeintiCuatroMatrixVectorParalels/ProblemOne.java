package tVeintiCuatroMatrixVectorParalels;

import java.util.*;

public class ProblemOne {
    private Scanner teclado;
    private String[] nombres;
    private int[][] sueldos; 
    private int[] total;
    private int cantidad, contador, columnas, suma;
    
    public void inicializar(){
        teclado = new Scanner(System.in);
        System.out.print("Ingrese cantidad de empleados: ");
        cantidad = teclado.nextInt();        
        nombres = new String[cantidad];             
    }
    
    public void dataAlumno(){       
        contador = 0;       
        for (int i = 0; i < cantidad; i++) {
            contador += 1;
            System.out.print("Ingresar Nombre del empleado " + contador + ": "); 
            nombres[i] = teclado.next();
        }
    }
    
    public void dataSueldo(){
        System.out.print("Ingrese la cantidad de meses: ");
        columnas = teclado.nextInt();
        sueldos = new int[cantidad][columnas];        
        contador = 0;
        for (int i = 0; i < sueldos.length; i++) {
            contador += 1;
            for (int j = 0; j < sueldos[i].length; j++) {
                System.out.print("Ingrese el sueldo del mes " + contador + " para empleado " + contador + ": ");
                sueldos[i][j] = teclado.nextInt();
            }
        }
    }
    
    public void calculoSueldo(){
        total = new int[cantidad];
        System.out.println("NOMBRES -------  TOTAL");
        for (int i = 0; i < sueldos.length; i++) {            
            System.out.print(nombres[i] + "   ");
            contador = 0;
            suma = 0;
            for (int j = 0; j < sueldos[i].length; j++) {
                suma += sueldos[i][j];
                System.out.print(sueldos[i][j] + " ");               
            } 
            total[i] = suma;
            System.out.print(suma + " "); 
            System.out.println();
        }
    }
    
    public void mayor(){
        int mayor = total[0];
        String empleado = nombres[0];
        for (int i = 0; i <sueldos.length; i++) {             
            if (total[i] > mayor) {
                mayor = total[i];
                empleado = nombres[i];
            }                                  
        }   
        System.out.println("Empledo mayor sueldo es: " + empleado + " con un sueldo de: " + mayor);
    }
    
    public static void main(String[] args) {
        ProblemOne po = new ProblemOne();
        po.inicializar();
        po.dataAlumno();
        po.dataSueldo();
        po.calculoSueldo();
        po.mayor();
    }  
}
