package g50Recursion;

public class ProblemThree {
    
    void imprimir(int x) {
        if (x>0) {
            System.out.println(x);
            imprimir(x-1);
        }        
    }
    public static void main(String[] args) {
        ProblemThree pt = new ProblemThree();
        pt.imprimir(10);
    }
}

