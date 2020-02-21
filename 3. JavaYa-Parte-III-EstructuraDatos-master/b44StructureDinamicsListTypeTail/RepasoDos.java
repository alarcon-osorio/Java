package b44StructureDinamicsListTypeTail;

public class RepasoDos {
    class Nodo {
        int elemento;
        Nodo siguiente;
    }
    
    private Nodo raiz, fondo;
    
    RepasoDos() {
        raiz = null;
        fondo = null;
    }
    
    boolean vacia() {
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
                raiz = null;
                fondo = null;
            }else{
                raiz = raiz.siguiente;
            }
            return element;
        }else{
            return Integer.MAX_VALUE;
        }
    }
    
    public void imprimir() {
        Nodo ultimo = raiz;
        System.out.println("Imprime todos los elementos del NODO: ");
        while(ultimo!=null) {
            System.out.println(ultimo.elemento + "");
            ultimo = ultimo.siguiente;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        RepasoDos rd = new RepasoDos();
        rd.insertar(1);
        rd.insertar(2);
        rd.insertar(3);
        rd.imprimir();
        System.out.println("Extraer el primer elemento " + rd.extraer());
        rd.imprimir();
    }
}
