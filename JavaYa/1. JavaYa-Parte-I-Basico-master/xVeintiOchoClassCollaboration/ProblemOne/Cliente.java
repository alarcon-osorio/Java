package xVeintiOchoClassCollaboration.ProblemOne;

public class Cliente {
    private String nombre;
    private int monto;
    
    public Cliente(String name) {
        nombre = name;
        monto = 0;
    }

    public void depositar(int deposito) {
        monto += deposito;        
    }
    
    public void extraer(int deposito) {
        monto -= deposito;
    }
    
    public int retornarMonto() {
        return monto;
    }
    
     public void imprimir() {
         System.out.println(nombre + " Tiene un monto de " + monto);
    }     
    
}
