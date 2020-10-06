package a42StructureDinamicsListTypeStack;

public class ProblemTwo {
    
    class Nodo{
        int info;
        Nodo sig;
    }
    
    private Nodo raiz;
    
    public ProblemTwo() {
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
        if (raiz!= null) {
            int informacion = raiz.info;
            raiz = raiz.sig;
            return informacion;
        }else{
            return Integer.MAX_VALUE;
        }
    }
    
    public void imprimir() {
        Nodo reco = raiz;
        System.out.println("Listado de los elementos de la pila");
        while(reco!=null){
            System.out.println(reco.info + "-");
            reco = reco.sig;
        }
        System.out.println();
    }
    
    public boolean vacia() {
        if (raiz==null) {
            return true;
        }else{
            return false;
        }
    }
    
    public int cantidad () {
        int cant = 0;
        Nodo reco = raiz;
        while(reco!=null) {
            cant++;
            reco = reco.sig;
        }
        return cant;
    }
    
    public static void main(String[] args) {
           ProblemTwo pt = new ProblemTwo();
           pt.insertar(1);
           pt.insertar(2);
           pt.insertar(0);
           pt.imprimir();
           System.out.println("La cantidad de los nodos es: " + pt.cantidad());
           while(pt.vacia()==false){
               System.out.println(pt.extraer());
           }
    }
}
