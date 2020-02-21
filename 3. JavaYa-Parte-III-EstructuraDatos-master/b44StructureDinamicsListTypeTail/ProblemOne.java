package b44StructureDinamicsListTypeTail;

public class ProblemOne {
    class Nodo {
        int elemento;
        Nodo siguiente;
    }
    
    private Nodo raiz, fondo;
    
    ProblemOne() {
        raiz = null;
        fondo = null;
    }
    
    public boolean vacia() {
        if (raiz==null) {
            return true;
        }else{
            return false;
        }
    }
    
    public void insertar(int elemento) {
        Nodo nuevo = new Nodo();
        nuevo.elemento = elemento;
        nuevo.siguiente = null;
        if (vacia()) {
            raiz = nuevo;
            fondo = nuevo;
        }else{            
            fondo.siguiente = nuevo;
            fondo = nuevo;
        }        
    }
    
    public int extraer() {
        if (!vacia()) {
            int element = raiz.elemento;
            if (raiz==fondo) {
                raiz= null;
                fondo = null;
            }else{
                raiz = raiz.siguiente;
            }
            return element;
        }else{
            return Integer.MAX_VALUE;
        }   
    }  
    
    public void imprimir (){
        Nodo ultimo = raiz;
        System.out.println("Todos los elementos del NODO: ");
        while(ultimo!=null) {
            System.out.println(ultimo.elemento + "");
            ultimo = ultimo.siguiente;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        ProblemOne po = new ProblemOne();
        po.insertar(1);
        po.insertar(2);
        po.insertar(3);
        po.imprimir();
        System.out.println("Extraemos de la pila el primer valor(FO) impreso: " + po.extraer() + " este numero fue tambien el primero insertado por eso es FIFO");
        po.imprimir();
    }
    
}
