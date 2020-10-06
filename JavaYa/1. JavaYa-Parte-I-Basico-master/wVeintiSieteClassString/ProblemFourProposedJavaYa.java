package wVeintiSieteClassString;

import java.util.Scanner;

public class ProblemFourProposedJavaYa {
    private Scanner teclado;
    private String[] nombres;
    private String[] mail;
    private int cantidad;
    
    public ProblemFourProposedJavaYa() {
         teclado=new Scanner(System.in);
         System.out.print("Ingrese cantidad de personas: ");
         cantidad = teclado.nextInt();
         
         nombres=new String[cantidad];
         mail=new String[cantidad];       
         
         for(int f=0;f<nombres.length;f++) {
             System.out.print("Ingrese nombre: ");
             nombres[f]=teclado.next();
             System.out.print("Ingrese mail: ");
             mail[f]=teclado.next();
         }
    }
    
    public void listar() {
        for(int f=0;f<nombres.length;f++) {
            System.out.println("Nombre: " + nombres[f] + " - email: " + mail[f]);
        }
    }
    
    public void consultaMail() {
        String aux;
        System.out.print("Buscar email por nombre de persona:");
        aux=teclado.next();
        boolean existe=false;
        for(int f=0;f<nombres.length;f++) {
            if (aux.equalsIgnoreCase(nombres[f])) {
                System.out.println("Mail de la persona:"+mail[f]);
                existe=true;
            }
        }
        if (existe==false) {
            System.out.println("No existe una persona con ese nombre.");
        }
    }

    public void sinArroba() {
        for(int f=0;f<mail.length;f++) {
            boolean tiene=false;
            for(int k=0;k<mail[f].length();k++) {
                if (mail[f].charAt(k)=='@') {
        	    tiene=true;
        	}
            }
            if (tiene==false) {
                System.out.println(mail[f]+" no tiene @");
            }
        }	
    }
    
    public static void main(String[] ar) {
        ProblemFourProposedJavaYa cad=new ProblemFourProposedJavaYa();
        cad.listar();        
        cad.sinArroba();
        cad.consultaMail();
    }
}