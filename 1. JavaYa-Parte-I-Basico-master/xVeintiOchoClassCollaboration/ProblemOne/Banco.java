package xVeintiOchoClassCollaboration.ProblemOne;

import java.util.*;

public class Banco {
    private Cliente cliente1, cliente2, cliente3;
        
    public Banco() {
        cliente1 = new Cliente("Juan");
        cliente2 = new Cliente("Pedro");
        cliente3 = new Cliente("Oscar");
    }
    
    public void operar() {
        cliente1.depositar(100);
        cliente2.depositar(200);
        cliente3.depositar(300);
        cliente1.extraer(50);
    }
    
    public void depositosTotales() {
        int total = cliente1.retornarMonto() + cliente2.retornarMonto() + cliente3.retornarMonto();
        System.out.println("El total en el banco es: " +  total);
        cliente1.imprimir();
        cliente2.imprimir();
        cliente3.imprimir();
    }  
    
    public static void main(String[] args) {
        Banco ba = new Banco();
        ba.operar();
        ba.depositosTotales();
    }
}
