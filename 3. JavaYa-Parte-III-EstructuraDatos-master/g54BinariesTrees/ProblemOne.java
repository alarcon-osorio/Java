package g54BinariesTrees;

public class ProblemOne {
    class Nodo {
        int dato;
        Nodo izq, der; 
    }
    
    Nodo raiz;
    
    public ProblemOne() {
        raiz = null;
    }
    
    public void insertar(int dato){
        Nodo nuevo = new Nodo();
        nuevo.dato = dato;
        nuevo.izq = null;
        nuevo.der = null;
        if (raiz == null) {
            raiz = nuevo;
        }else{
            Nodo anterior = null, recorrer;
            recorrer = raiz;
            while(recorrer != null){
                anterior = recorrer;
                if (dato < recorrer.dato) {
                    recorrer = recorrer.izq;
                }else{
                    recorrer = recorrer.der;
                }
                if (dato < anterior.dato) {
                    anterior.izq = nuevo;                    
                }else{
                    anterior.der = nuevo;
                }
            }
        }
    }
    
    public void imprimirPre(Nodo recorrer) {
        if (recorrer!=null) {
            System.out.println(recorrer.dato + "");
            imprimirPre(recorrer.izq);
            imprimirPre(recorrer.der);            
        }
    }
    
    public void imprimirPre() {
        imprimirPre(raiz);
        System.out.println();
    }
    
    public void imprimirEntre(Nodo recorrer) {
        if (recorrer!=null) {
            imprimirEntre(recorrer.izq);
            System.out.println(recorrer.dato + "");            
            imprimirEntre(recorrer.der);            
        }
    }
    
    public void imprimirEntre() {
        imprimirEntre(raiz);
        System.out.println();
    }
    
    public void imprimirPost(Nodo recorrer) {
        if (recorrer!=null) {
            imprimirPost(recorrer.izq);
            imprimirPost(recorrer.der);   
            System.out.println(recorrer.dato + "");                    
        }
    }
    
    public void imprimirPost() {
        imprimirPost(raiz);
        System.out.println();
    }
    
    public static void main(String[] args) {
        ProblemOne abo = new ProblemOne();
        abo.insertar (100);
        abo.insertar (50);
        abo.insertar (25);
        abo.insertar (75);
        abo.insertar (150);
        System.out.println ("Impresion preorden: ");
        abo.imprimirPre ();
        System.out.println ("Impresion entreorden: ");
        abo.imprimirEntre ();
        System.out.println ("Impresion postorden: ");
        abo.imprimirPost ();   
    }
}
