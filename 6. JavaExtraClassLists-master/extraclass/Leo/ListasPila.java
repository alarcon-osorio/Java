package extraclass.Leo;


public class ListasPila {
    class Nodo {
        Object dato; //Si queremos insertar un datos String u de otro NO OLVIDAR CAMBIOAR EL PARAMETRO DE insertar
        //int dato; //Guarda el numero
        Nodo siguiente; //Crea un objeto de la misma clase, es recursivo
    }
    
    private Nodo raiz; // Nodo privado de tipo raiz --- ultimo elemento en pilas no en colas
    
    public ListasPila() {
        raiz = null;
    }
    
    public void insertar(Object dato) { //Se debe cambiar el parametro
        Nodo nuevo = new Nodo(); //
        nuevo.dato = dato; //Se asgina un parametro a la propiedad del objeto nuevo
        if (raiz==null) { //Quiere decir que no se ha creado la lista si es nulo
            nuevo.siguiente = null; //El objeto nuevo es = 5 --> null no hay ningun valor adelante de 5
            raiz = nuevo;
        }else{ //En caso de que exista ya un elemento
            nuevo.siguiente = raiz; //Existe el elemento 5 --> null y creamos uno nuevo 4 --> raiz
            raiz = nuevo; // Lo que se hace es 5--> 4 --> null
            //No se esta haciendo igualacion la mejor forma de verlo es decir que mando raiz a nuevo
        }
    }
    
     public Object extraer() { //Extaer el ultimo elemento en entrar LIFO
        if (raiz!=null) { //si raiz es diferente a NULL
            Object ultimo = raiz.dato; //Asigno a una nueva variable Object el dato de la raiz 
            raiz = raiz.siguiente; //Introduzco un siguiente a la raiz 
            return ultimo;
        }else{
            return Integer.MAX_VALUE; //Retorna el entero con mayor valor
        }
    }
    
    public void imprimir() {
        Nodo recorrer = raiz; //Le decimos que se vaya al ultimo elemento
        System.out.println("Se muestran los elementos: ");
        while(recorrer!=null) { //Mientras que recorrer sea diferente a nulo por que cuandos ea nulo esta en el ultimo elemento
            System.out.println(recorrer.dato + "-"); //Recorre  
            recorrer = recorrer.siguiente; //Con esto se aumenta de uno en uno siguiente apunta al segundo nodo 
        }
        System.out.println(); //Salto de linea a los resultados
    }
    
    public static void main(String[] args) {
        ListasPila lp = new ListasPila();
        lp.insertar("5.Hola");
        lp.insertar("4." + true);
        lp.insertar(3.3);
        lp.insertar(2);
        lp.insertar(1);
        lp.imprimir();    
        System.out.println("Extraigo el ultimo DATO que inserte pero el primero en la lista: " + lp.extraer());
        System.out.println("Siendo esto LIFO Last In First Out");
        lp.imprimir(); 
    }
}
