package PaginaCuatroCinco;

import java.io.*;  //Import Buffered
import java.util.*; //import Scanner

public class PaginaCuatro {
    public static void main(String[] args) throws IOException{
        Scanner teclado=new Scanner(System.in);
        int horasTrabajadas;
        float costoHora;
        float sueldo;
        int dia;
        
        System.out.print("Ingrese la cantidad de horas trabajadas por el empleado:");
        horasTrabajadas=teclado.nextInt();
        
        System.out.print("Ingrese el valor de la hora:");
        costoHora=teclado.nextFloat();
        
        sueldo = horasTrabajadas * costoHora;
        System.out.print("El empleado debe cobrar:" + sueldo + "\n");
        
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Ingrese Valor del dia: ");
        dia = Integer.parseInt(entrada.readLine());
        
        System.out.println("El valor del dia es: " + dia);
        
    }
}
