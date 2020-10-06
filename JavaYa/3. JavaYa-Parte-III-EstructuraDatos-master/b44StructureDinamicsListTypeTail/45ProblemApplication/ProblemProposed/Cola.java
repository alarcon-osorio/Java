package b44StructureDinamicsListTypeTail;

public class Cola {
    class Nodo{
        int elementos;
        Nodo siguiente;
    }
    
    private Nodo raiz, fondo;
    
    Cola() {
        raiz = null;
        fondo = null;
    }
    
    boolean vacia() {
        if (raiz== null) {
            return true;
        }else{
            return false;
        }
    }
    
    void insertar(int elementos) {
        Nodo nuevo = new Nodo();
        nuevo.elementos = elementos;
        nuevo.siguiente = null;
        if (vacia()) {
            raiz = nuevo;
            fondo = nuevo;
        }else{
            fondo.siguiente = nuevo;
            fondo = nuevo;
        }
    }
    
    int extraer() {
        if (!vacia()) {
            int element = raiz.elementos;
            if (raiz == fondo) {
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
        System.out.println("Imprime todos los elementos del NODO");
        while(ultimo!=null) {
            System.out.println(ultimo.elementos + "");
            ultimo = ultimo.siguiente;
        }
        System.out.println();
    }
    
    public int cantidad() {
        int cant = 0;
        Nodo ultimo = raiz;
        while(ultimo!=null){
            cant++;
            ultimo = ultimo.siguiente;
        }
        return cant;
    }
}
