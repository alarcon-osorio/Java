package pPaginaVeinteOrdenVectors;

import java.util.*;

public class ProblemTwo {
    private Scanner teclado;
    private String[] paises;
    private int contador, cant;

    public void inicializar(){
        teclado = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de paises a organizar alfabeticamente: ");
        cant = teclado.nextInt();
        paises = new String[cant];
        contador = 0;       
        for (int i =0; i < paises.length; i++){
            contador += 1;
            System.out.println("Ingresar Pais " + contador + ": ");
            paises[i] = teclado.next();
        }
    }

    public void ordenar(){
        int canTotal = cant - 1; //Le resta 1 a la cantidad ingresada en el arreglo
        for (int i = 0; i < canTotal; i++) {
            for (int j = 0; j < canTotal - i; j++) {
                if (paises[j].compareTo(paises[j+1]) > 0 ) {
                    String aux;
                    aux = paises[j];
                    paises[j] = paises[j+1];
                    paises[j+1] = aux;
                }
            }
        }
    }

    public void imprimir(){
        System.out.println("Los paises Ingresados y ordenados alfabeticamente son:");
        for (int i = 0; i < paises.length; i++) {
            System.out.println(paises[i]);
        }
    }

    public static void main(String[] args) {
        ProblemTwo pt = new ProblemTwo();
        pt.inicializar();
        pt.ordenar();
        pt.imprimir();
    }
    
}
