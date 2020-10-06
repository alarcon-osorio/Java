package a42StructureDinamicsListTypeStack;

public class RepasoTres {

    class Nodo {

        int info;
        Nodo sig;
    }

    private Nodo raiz;

    RepasoTres() {
        raiz = null;
    }

    public void insertar(int x) {
        Nodo nuevo;
        nuevo = new Nodo();
        nuevo.info = x;
        if (raiz == null) {
            nuevo.sig = null;
            raiz = nuevo;
        } else {
            nuevo.sig = raiz;
            raiz = nuevo;
        }
    }

    public int extraer() {
        if (raiz != null) {
            int informacion = raiz.info;
            raiz = raiz.sig;
            return informacion;
        } else {
            return Integer.MAX_VALUE;
        }
    }

    public void imprimir() {
        Nodo reco;
        reco = raiz;
        System.out.println("Lista completa de Pilas");
        while (reco != null) {
            System.out.println(reco.info + "");
            reco = reco.sig;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        RepasoTres rt = new RepasoTres();
        rt.insertar(0);
        rt.insertar(0);
        rt.insertar(0);
        rt.imprimir();
        System.out.println("Extraigo un elemento de la pila " + rt.extraer());
        rt.imprimir();
    }

}
