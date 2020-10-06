package PaginaNueveIF;

import java.util.*;

public class ProblemOne {
    public static void main(String[] args) {
        int dia;
        int mes;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese Dia: ");
        dia = teclado.nextInt();
        
        System.out.println("Ingrese Mes: ");
        mes = teclado.nextInt();
        
        if(dia >= 1 && dia <= 31){
            System.out.println("El dia es: " + dia);
        }else{
            System.out.println("Ingrese dia correcto");            
        }
        
        if(mes >= 1 && mes <= 12){
            System.out.println("El mes es: " + mes);
        }else{
            System.out.println("Ingrese mes correcto");
        }
        
        if(mes == 12){
            System.out.println("Hoy es " + dia + " Diciembre");
        }
    }

}

