package a42StructureDinamicsListTypeStack;

public class ProblemOneProposed {
    
    class Nodo {
        int info;
        Nodo sig;
    }
    
    private Nodo raiz;
    
    ProblemOneProposed() {
        raiz = null;
    }
    
    public void insertar(int x) {
        Nodo nuevo;
        nuevo = new Nodo();
        nuevo.info = x;
        if(raiz==null) {
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
    
    
    public int retornar() {
        if (raiz!=null) {
            int informacion = raiz.info;
            return informacion;
        }else{
            return Integer.MAX_VALUE;
        }
    }
    public void imprimir() {
        Nodo reco = raiz;
        System.out.println("Listado de los elementos de la pila");
         while(reco!= null) {
             System.out.println(reco.info + "-");
             reco = reco.sig;
         }   
         System.out.println();
    }
    
    public static void main(String[] args) {
        ProblemOneProposed pop = new ProblemOneProposed();
        pop.insertar(10);
        pop.insertar(40);
        pop.insertar(3);
        pop.imprimir();
        System.out.println("Extraemos de la pila " + pop.extraer());
        pop.imprimir();
        System.out.println("Retornamos el primero de la fila " + pop.retornar());
        pop.imprimir();
    }
}
