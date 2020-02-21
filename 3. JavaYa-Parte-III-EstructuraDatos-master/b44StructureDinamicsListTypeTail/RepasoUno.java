package b44StructureDinamicsListTypeTail;

public class RepasoUno {
    class Nodo {
        int elemento;
        Nodo siguiente;
    }
    
    private Nodo raiz, fondo;
    
    RepasoUno() {
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
        System.out.println("Imprime todos los elemento del Nodo: ");
        while(ultimo!=null){
            System.out.println(ultimo.elemento + "");
            ultimo = ultimo.siguiente;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        RepasoUno ru = new RepasoUno();
        ru.insertar(1);
        ru.insertar(2);
        ru.insertar(3);
        ru.imprimir();
        System.out.println("Extraer el primer elemento: " + ru.extraer());
        ru.imprimir();
    }
}
