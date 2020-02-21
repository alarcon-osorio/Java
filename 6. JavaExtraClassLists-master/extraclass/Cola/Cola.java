package extraclass.Cola;

public class Cola {
    NodoCola inicio, fin;
    int tam;
    
    public Cola() {
        inicio = null;
        fin = null;
        tam = 0;
    }
    
    public boolean vacia() {
        return inicio == null;
    }
    
    public void insertar(int elemento) {
        NodoCola nuevo = new NodoCola(elemento);
        if (vacia()) {
            inicio = nuevo;
        }else{
            fin.siguiente = nuevo;            
        }
        fin = nuevo;
        tam ++;
    }
    
    public int extraer() {
        int aux = inicio.dato;
        inicio = inicio.siguiente;
        tam --;
        return aux;        
    }
    
    public int inicioCola() {
        return inicio.dato;
    }
    
    public int tamanioCola() {
        return tam;
    }
}
