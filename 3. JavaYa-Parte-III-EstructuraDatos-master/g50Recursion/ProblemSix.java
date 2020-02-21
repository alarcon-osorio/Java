package g50Recursion;

public class ProblemSix {
    static int [] vect = {312, 614, 88, 22, 54};
    
    void ordenar(int [] v, int cant){
        if (cant > 1) {
            for (int i = 0; i < cant -1; i++)
                if (v[i] > v [i + 1]) {
                    int aux = v [i];
                    v[i] = v [i + 1];
                    v [i + 1] = aux;
                }             
            ordenar(v, cant -1);           
        }   
    }
    
    void imprimir() {
        for (int i = 0; i < vect.length; i++)
            System.out.print(vect[i] + " ");
        System.out.println("\n");        
    }
    
    public static void main(String[] args) {    
        ProblemSix ps = new ProblemSix();
        ps.imprimir();
        ps.ordenar(vect, vect.length);
        ps.imprimir();
    }
}
