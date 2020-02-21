package e63ForCollections.TypeObject;

import java.util.ArrayList;
import java.util.List;

public class RepasoMazo {
    private Carta []cartas;
     
     
    RepasoMazo(){
       cartas = new Carta[6];
       cartas[0] = new Carta(1,"Rey");
       cartas[1] = new Carta(2,"Rey");
       cartas[2] = new Carta(3,"Rey");
       cartas[3] = new Carta(4,"Rey");
       cartas[4] = new Carta(5,"Rey");
       cartas[5] = new Carta(6,"Rey");
    }
    
    public void imprimir() {
        System.out.println("Listado de todas las cartas");
        for (Carta carta: cartas) {
           carta.imprimir(); 
        }        
    }
    
    public void alAzar() {
        System.out.println("Una carta al Azar");
           cartas[(int)(Math.random() * 6)].imprimir();
    }
    
    public static void main(String[] args) {
        RepasoMazo rm = new RepasoMazo();
        rm.imprimir();
        rm.alAzar();
    }
    
}
