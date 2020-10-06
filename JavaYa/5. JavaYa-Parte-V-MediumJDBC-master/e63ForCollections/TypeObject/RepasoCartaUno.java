package e63ForCollections.TypeObject;

public class RepasoCartaUno {
    private int numero;
    private String palo;
    
    RepasoCartaUno(int number, String stick) {
        this.numero = number;
        this.palo = stick;
    }
    
    public void imprimir(){
        System.out.println(numero + "" + palo);
    }
}
