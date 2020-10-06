package d47StructureDinamicsListGenericsOrder;

public class ProblemOne {
   
    class Nodo {
       int elemento;
       Nodo siguiente;
   } 
   
   private Nodo raiz;
   
   public ProblemOne() {
       raiz = null;
   }
   
   void insertar(int x) {
       Nodo nuevo = new Nodo();
       nuevo.elemento = x;
       if (raiz == null) {
           raiz = nuevo;
       }else{
           if (x<raiz.elemento) {
               nuevo.siguiente = raiz;
               raiz = nuevo;
           }else{
               Nodo reco = raiz;
               Nodo atras = raiz;
               while(x>=reco.elemento && reco.siguiente!=null){
                   atras = reco;
                   reco = reco.siguiente;
               }
               if (x >= reco.elemento) {
                   reco.siguiente = nuevo;
               }else{
                   nuevo.siguiente = reco;
                   atras.siguiente = nuevo;
               }
           }
       }      
   }
   
    public void imprimir () {
       Nodo reco = raiz;
        System.out.println("Estas listas imprimen los elementos en el orden ascendente no importa como se hayan insetado");
        while(reco!=null) {
            System.out.println(reco.elemento + "");
            reco = reco.siguiente;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        ProblemOne po = new ProblemOne();
        po.insertar(1);
        po.insertar(3);
        po.insertar(5);
        po.insertar(2);
        po.imprimir();
    }
   
}
