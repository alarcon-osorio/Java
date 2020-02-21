package e63ForCollections.TypeObject;

public class RepasoCarta {
    private int numero;
    private String palo;
      
    RepasoCarta(int number, String stick) {
        this.numero = number;
        this.palo = stick;
    }
    
    public void imprimir() {
        System.out.println(numero + " - " + palo);
    }
    
}
