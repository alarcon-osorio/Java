package a42StructureDinamicsListTypeStack;


public class ProblemOne {
    
    class Nodo {
        int info; //Declaro var info
        Nodo sig; //Instacio Nodo a sig
    }
    
    private Nodo raiz; //Instacion Nodo a raiz
    
    public ProblemOne() { //Se crea constructor
        raiz = null; //Creo el puntero raiz en null
    }
    
    public void insertar(int x) { //creo un metodo para insertar
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
        System.out.println("Listado de los elementos de la pila");
        while(reco!= null) {
            System.out.println(reco.info + " - ");
            reco= reco.sig;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        ProblemOne po = new ProblemOne();
        po.insertar(1);
        po.insertar(2);
        po.insertar(3);
        po.imprimir();
        System.out.println("Extraemos de la pila el primer valor(FO) impreso: " + po.extraer() + " que fue el ultimo en insertar por eso es LIFO");
        po.imprimir();
    }
    
}
