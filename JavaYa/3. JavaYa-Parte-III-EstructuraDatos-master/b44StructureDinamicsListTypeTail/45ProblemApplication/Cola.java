package b44StructureDinamicsListTypeTail.ProblemApplication;

public class Cola {
    class Nodo {
        int elemento;
        Nodo siguiente;
    }
    
    Nodo raiz, fondo;
    
    Cola() {
        raiz = null;
        fondo = null;                
    }
    
    public boolean vacia() {
        if (raiz == null) {
            return true;
        }else{
            return false;
        }
    }
    
    void insertar(int elemento) {
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
    
    int extraer() {
        if (!vacia()) {
            int element = raiz.elemento;
            if (raiz == fondo) {
                raiz = null;
                fondo = null;
            }else{
                raiz = raiz.siguiente;
            }
            return element;
        } else{
            return Integer.MAX_VALUE;
        }         
    }

    public void imprimir() {
        Nodo ultimo = raiz;
        System.out.println("Imprimir tosos los elements del NODO");
        while(ultimo!=null) {
            System.out.println(ultimo.elemento + "");
            ultimo = ultimo.siguiente;
        }
        System.out.println();
    } 
    
    public int cantidad() {
        int cantidad = 0;
        Nodo ultimo = raiz;
        while(ultimo!=null) {
            cantidad++;
            ultimo = ultimo.siguiente;
        }
        return cantidad;
    }
}