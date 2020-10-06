package e63ForCollections;

import java.util.*;

public class ProblemOne {
    private Scanner teclado;
    private int[] sueldos;
    private int cantidad;
    
    public ProblemOne() {
        teclado = new Scanner(System.in);
        System.out.print("Ingrese cantidad de sueldos: ");
        cantidad = teclado.nextInt();
        sueldos = new int[cantidad];
        for (int i = 0; i < sueldos.length; i++) {
            System.out.print("Ingrese sueldo numero " + (i+1) + ": ");
            sueldos[i] = teclado.nextInt();
        }        
    }
    
    public void imprimir() {
        for (int monto: sueldos) {
            System.out.println("Sueldos: " + monto);
        }
    }
    
    public void esMayor() {
        int mayor = sueldos[0];
        for (int monto: sueldos) {
            if (monto > mayor) {
                mayor = monto;
            }            
        }
        System.out.println("Sueldo mayor: " + mayor);        
    }
    
    public static void main(String[] args) {       
        ProblemOne po = new ProblemOne();    
        po.imprimir();
        po.esMayor();
    }
}
