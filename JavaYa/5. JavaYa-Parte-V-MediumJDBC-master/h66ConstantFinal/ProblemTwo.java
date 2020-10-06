package h66ConstantFinal;


public class ProblemTwo {
    private final String documento;
    private float monto;
 
    ProblemTwo(String documento, float monto) {
        this.documento = documento;
        this.monto = monto;
    }
    
    ProblemTwo(String documento) {
        this.documento = documento;
        this.monto = 0;
    }
    
    public void imprimir() {
        System.out.println("Documento: " + documento + " Saldo: " + monto);
    }
    
    public static void main(String[] args) {
        ProblemTwo pt1 = new ProblemTwo("1010192548", 50000);
        pt1.imprimir();
        ProblemTwo pt2 = new ProblemTwo("1010192548");
        pt2.imprimir();
    }
    
}
