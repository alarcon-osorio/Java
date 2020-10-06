package g50Recursion.g51ProblemApplication;

public class ProblemOne {
    
    class Nodo {
        Object dato;
        Nodo siguiente;
    }
    
    private Nodo raiz;
    
    ProblemOne() {
        raiz = null;
    }
    
    public void insertarPrimero(int dato) {
        Nodo nuevo = new Nodo();
        nuevo.dato = dato;
        nuevo.siguiente = raiz;
        raiz = nuevo;
    }
    
    
    public void imprimirInversa(Nodo reco) {
        if (reco!=null) {
            imprimirInversa(reco.siguiente);
            System.out.println(reco.dato + "-");
        }
    }
    
    public void imprimirInversa(){
        imprimirInversa(raiz);
    }
    
    public static void main(String[] args) {
        ProblemOne po = new ProblemOne();
        po.insertarPrimero(10);
        po.insertarPrimero(4);
        po.insertarPrimero(5);
        po.imprimirInversa();
        
    }
    
}
