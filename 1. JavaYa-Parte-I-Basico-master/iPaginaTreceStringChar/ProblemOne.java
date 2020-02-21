package PaginaTreceStringChar;

import java.util.Scanner;

public class ProblemOne {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String nombre1, nombre2;
        int edad1, edad2;
        
        nombre1 = null;
        nombre2 = null;
        
        System.out.print("Ingrese el nombre del usuario 1: ");
        nombre1 = teclado.nextLine(); //nextLine() permite ingresar String con espacio en blanco

        System.out.print("Ingrese la edad: ");
        edad1 = teclado.nextInt(); //next() permite ingresar String sin espacio en blanco
        
        System.out.print("Ingrese el nombre del usuario 2: ");
        teclado.nextLine(); 
        /*
        Cuando se ingresa una cadena con caracteres en blanco debemos tener en cuenta en llamar al método nextLine() 
        Una dificultad se presenta si llamamos al método nextLine() y previamente hemos llamado al método nextInt() o nextFloat(), 
        esto debido a que luego de ejecutar el método nextInt() queda almacenado en el objeto de la clase Scanner el 
        caracter "Enter" y si llamamos inmediatamente al método nextLine() este almacena dicho valor de tecla y continúa 
        con el flujo del programa. Para solucionar este problema debemos generar un código similar a LO ANTERIOR        
        System.out.print("Ingrese edad:");
        edad1 = teclado.nextInt();
        System.out.print("Ingrese el apellido y el nombre:");
        teclado.nextLine();
        apenom2=teclado.nextLine();
        */
        nombre2 = teclado.nextLine(); 

        System.out.print("Ingrese la edad: ");
        edad2 = teclado.nextInt();  

        if (edad1 > edad2) {
            System.out.println("La persona de mayor edad es: "  + nombre1 + " con edad: " + edad1);
        }else{
            System.out.println("La persona de mayor edad es: "  + nombre2 + " con edad: " + edad2);
        }
        
    }
}
