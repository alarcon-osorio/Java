package a42StructureDinamicsListTypeStack;

public class RepasoDos {
    
    class Nodo{
        int info;
        Nodo sig;
    }
    
    private Nodo raiz;
    
    RepasoDos() {
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
        System.out.println("Lista completa de nodos :");
        while(reco!=null) {
            System.out.println(reco.info + "+");
            reco = reco.sig;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        RepasoDos rd = new RepasoDos();
        rd.insertar(0);
        rd.insertar(0);
        rd.insertar(0);
        rd.imprimir();
        System.out.println("Extraigo el ultimo " + rd.extraer());
        rd.imprimir();
    }
}
