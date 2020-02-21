package a42StructureDinamicsListTypeStack;

public class RepasoUno {
    
    class Nodo{
        int info;
        Nodo sig;
    }
    
    private Nodo raiz;
    
    RepasoUno() {
        raiz = null;
    }
    
    public void insertar(int x) {
        Nodo nuevo;
        nuevo = new Nodo();
        nuevo.info = x;
        if (raiz==null) {
            nuevo.sig = null;
            raiz = nuevo;
        }else{
            nuevo.sig = raiz;
            raiz = nuevo;
        }
    }
    
    public int extraer() {
        if (raiz!=null) {
            int informacion = raiz.info;
            raiz = raiz.sig;
            return informacion;
        }else{
            return Integer.MAX_VALUE;
        }
    }
    
    public void imprimir() {
        Nodo reco = raiz;
        System.out.println("La lista de nodos es: ");
        while(reco!=null){
            System.out.println(reco.info + " - ");
            reco = reco.sig;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        RepasoUno ru = new RepasoUno();
        ru.insertar(0);
        ru.insertar(0);
        ru.insertar(0);
        ru.imprimir();
        System.out.println("Extraemos de la pila " + ru.extraer());
        ru.imprimir();
    }
}
