package i67Enum.ProblemOne;


public class Carta {
    public enum Operaciones{
        TREBOL, DIAMANTE, CORAZON, PICA
    };
    
    private int numero;
    private Operaciones operaciones;
    
    Carta (int numero, Operaciones operaciones) {
        this.numero = numero;
        this.operaciones = operaciones;
    }
    
    public void imprimir() {
        System.out.println(numero + " - " + operaciones);
    }
    
    public Operaciones retornarOperacion(){
        return operaciones;
    }
}
