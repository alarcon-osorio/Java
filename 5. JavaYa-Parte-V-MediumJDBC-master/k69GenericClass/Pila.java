package k69GenericClass;

public class Pila<E>{
    class Nodo {
        public E info;
        public Nodo sig;
    }
    
    private Nodo raiz;
    
    public void insertar(E x) {
        Nodo nuevo = new Nodo();
        nuevo.info = x;
        if (raiz == null) {
            nuevo.sig = null;
            raiz = nuevo;
        }else{
            nuevo.sig = raiz;
            raiz = nuevo;
        }
    }
    
    public E extraer() {
        if(raiz == null){
            E informacion = raiz.info;
            raiz = raiz.sig;
            return informacion;
        }else{
            return null;
        }
    }
    
    public int cantidad() {
        int cant = 0;
        Nodo recorrer = raiz;
        if (recorrer != null) {
            recorrer = recorrer.sig;
            cant++;
        }
        return cant;
    }
}
