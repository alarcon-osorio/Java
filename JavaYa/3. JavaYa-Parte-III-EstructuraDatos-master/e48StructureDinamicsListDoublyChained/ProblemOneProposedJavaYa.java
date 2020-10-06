package e48StructureDinamicsListDoublyChained;

public class ProblemOneProposedJavaYa {
    
    class Nodo {
        int info;
        Nodo ant,sig;
    }
    
    private Nodo raiz;
    
    public ProblemOneProposedJavaYa () {
        raiz=null;
    }
      
    void insertarPrimero(int x)
    {
          Nodo nuevo = new Nodo ();
        nuevo.info = x;
        nuevo.sig=raiz;
        if (raiz!=null)
            raiz.ant=nuevo;
        raiz=nuevo;
    }

    public void insertarUtlimo(int x) {
          Nodo nuevo = new Nodo ();
        nuevo.info = x;
        if (raiz==null)
            raiz=nuevo;
        else {
            Nodo reco=raiz;
            while (reco.sig!=null) {
                reco=reco.sig;
            }
            reco.sig=nuevo;
            nuevo.ant=reco;
        }
    }
    
    public void insertarSegundo(int x) {
        if (raiz!=null) {
              Nodo nuevo = new Nodo ();
            nuevo.info = x;
            if (raiz.sig==null) {
                //Hay un solo nodo.
                raiz.sig=nuevo;
                nuevo.ant=raiz;
            } else {
                Nodo tercero=raiz.sig;
                nuevo.sig=tercero;
                tercero.ant=nuevo;
                raiz.sig=nuevo;
                nuevo.ant=raiz;
            }
        }
    }
    
    public void insertarAnteUltimo(int x) {
        if (raiz!=null) {
              Nodo nuevo = new Nodo ();
            nuevo.info = x;
            if (raiz.sig==null) {
                //Hay un solo nodo.
                nuevo.sig=raiz;
                raiz=nuevo;
            } else {
                Nodo reco=raiz;
                while (reco.sig!=null) {
                    reco=reco.sig;
                }
                Nodo anterior=reco.ant;
                nuevo.sig=reco;
                nuevo.ant=anterior;
                anterior.sig=nuevo;
                reco.ant=nuevo;
            }
        }
    }
    
    public void borrarPrimero() {
        if (raiz!=null) {
            raiz=raiz.sig;
        }
    }
    
    public void borrarSegundo() {
        if (raiz!=null) {
            if (raiz.sig!=null) {
                Nodo tercero=raiz.sig;
                tercero=tercero.sig;
                raiz.sig=tercero;
                if (tercero!=null)
                    tercero.ant=raiz;
            }
        }
    }
    
    public void borrarUltimo () {
        if (raiz!=null) {
            if (raiz.sig==null) {
                raiz=null;
            } else {
                Nodo reco=raiz;
                while(reco.sig!=null) {
                    reco=reco.sig;
                }
                reco=reco.ant;
                reco.sig=null;
            }
        }
        
    }
    public void imprimir () {
        Nodo reco = raiz;
        while (reco != null) {
            System.out.print (reco.info + "-");
            reco = reco.sig;
        }
        System.out.println();
    }
    
    public void borrarMayor() {
        if (raiz!=null) {
            Nodo reco=raiz;
            int may=raiz.info;
            while (reco!=null) {
                if (reco.info>may) {
                    may=reco.info;
                }
                reco=reco.sig;
            }
            reco=raiz;
            while (reco!=null) {
                if (reco.info==may) {
                    if (reco==raiz) {
                        raiz=raiz.sig;
                        if (raiz!=null)
                            raiz.ant=null;
                        reco=raiz;
                    } else {
                        Nodo atras=reco.ant;
                        atras.sig=reco.sig;
                        reco=reco.sig;
                        if (reco!=null)
                            reco.ant=atras;
                    }
                } else {
                    reco=reco.sig;
                }
            }
        }
    }
    
    
    public static void main(String[] ar) {
        ProblemOneProposedJavaYa lg=new ProblemOneProposedJavaYa();
        lg.insertarPrimero (10);
        lg.insertarPrimero(45);
        lg.insertarPrimero(23);
        lg.insertarPrimero(89);
        lg.imprimir();
        System.out.println("Insertamos un nodo al final:");
        lg.insertarUtlimo(160);
        lg.imprimir();
        System.out.println("Insertamos un nodo en la segunda posición:");
        lg.insertarSegundo(13);
        lg.imprimir();
        System.out.println("Insertamos un nodo en la anteultima posición:");
        lg.insertarAnteUltimo(600);
        lg.imprimir();
        System.out.println("Borramos el primer nodo de la lista:");
        lg.borrarPrimero();
        lg.imprimir();        
        System.out.println("Borramos el segundo nodo de la lista:");
        lg.borrarSegundo();
        lg.imprimir();
        System.out.println("Borramos el ultimo nodo de la lista:");
        lg.borrarUltimo();
        lg.imprimir();                
        System.out.println("Borramos el mayor de la lista:");
        lg.borrarMayor();
        lg.imprimir();                        
    }
}