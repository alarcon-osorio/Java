package e63ForCollections.TypeObject;


public class Carta {
    private String palo;
    private int numero;
    
    Carta(int number, String stick) {
        this.palo = stick;
        this.numero = number;
    }
    
    public void imprimir(){
        System.out.println(numero + "-" + palo);
    }
}
