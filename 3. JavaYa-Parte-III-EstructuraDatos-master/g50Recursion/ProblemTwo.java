package g50Recursion;

public class ProblemTwo {
    
    void imprimir(int x) {
        System.out.println(x);
        imprimir(x-1);        
    }
    public static void main(String[] args) {
        ProblemTwo pt = new ProblemTwo();
        pt.imprimir(10);
    }
}
