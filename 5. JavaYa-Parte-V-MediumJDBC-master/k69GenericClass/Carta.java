package k69GenericClass;


public class Carta {
    private int numero;
    private String palo;
    
    Carta(int number, String stick){
        this.numero = number;
        this.palo = stick;
    }
    
    public void imprimir() {
        System.out.println(numero + " " + palo);
    }
}
