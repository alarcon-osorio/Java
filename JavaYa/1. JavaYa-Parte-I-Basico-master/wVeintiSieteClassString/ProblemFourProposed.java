package wVeintiSieteClassString;

import java.util.*;
public class ProblemFourProposed {
    private Scanner teclado;
    private String[] nombre;
    private String[] mail;
    private int cantidad, contador;
    
    public ProblemFourProposed(){
        teclado = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de personas: ");
        cantidad = teclado.nextInt();
        nombre = new String[cantidad];
        mail = new String[cantidad];
        contador = 0;
        for (int i = 0; i < cantidad; i++) {
            contador += 1;
            System.out.print("Ingrese nombre persona "  + contador + ": ");
            nombre[i] = teclado.next();
            System.out.print("Ingrese correo de " + nombre[i] + ": ");
            mail[i] = teclado.next();
        }        
    }
    
    public void imprimirData(){
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Nombre: " + nombre[i] + " Correo: " + mail[i]);            
        }
    }
    
    public void consultarMail(){
        System.out.print("Consultar correo por nombre: ");
        String consulta = teclado.next();        
        boolean existe = false;
        String correo = "";
        for (int i = 0; i < nombre.length; i++) {
            if (consulta.equalsIgnoreCase(nombre[i])) {
                existe = true;
                correo = mail[i];
            }
        }        
        if (existe == true) {
            System.out.println("El email de " + consulta + " es: " + correo);
        }else{
            System.out.println("Lo sentimos no encontramos el correo de la persona consultada");
        }        
    }
    
    public void sinArroba(){
        for (int i = 0; i < mail.length; i++) {
            boolean arroba = false;
            for (int j = 0; j < mail[i].length(); j++) {
                if (mail[i].charAt(j) == '@') {
                    arroba = true;
                } 
            }
            if (arroba == true) {
                System.out.println("El correo " + mail[i] + " PASA la validación");
            }else{
                System.out.println("El correo " + mail[i] + " NO PASA la validación");
            }
        }
        
    }
    
    public static void main(String[] args) {
        ProblemFourProposed pfp = new ProblemFourProposed();
        pfp.imprimirData();
        pfp.sinArroba();
        pfp.consultarMail();        
    }
}
