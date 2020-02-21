package extraclass.Pila;

public class Pila {
    private NodoPila cima;
    int tam;
    
    public Pila() {
        cima = null;
        tam = 0;
    }
    
    //Metodo para saber cuando la pila esta vacia 
    
    public boolean vacia() {
        return cima == null;
    }
    
    //Metodo ara empujar un elemento en la pila PUSH
    public void insertar(int elemento) {
        NodoPila nuevo = new NodoPila(elemento);
        nuevo.siguiente = cima;
        cima = nuevo;
        tam ++;
    }
    
    //Metodo ara extraer un elemento en la pila POP
    public int extraer() {
        int aux = cima.dato;
        cima = cima.siguiente;
        tam --;
        return aux;
    }
    
    //Metodo para saber quien esta en la cima de la PILA
    
    public int cima() {
        return cima.dato;
    }
    
    //Meotod para saber el tamaño de la PILA
    public int tamanioPila() {
        return tam;
    }
    
    //Metodo para LIMPIAR o varia la PILA
    
    public void limpiarPila() {
        while(!vacia()) {
            extraer();
        }
    }
}
