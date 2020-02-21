package g50Recursion;

public class ProblemFour {
    
    void imprimir(int x) {
        if (x<=10) {
            System.out.println(x);
            imprimir(x+1);
        }        
    }
    public static void main(String[] args) {
        ProblemFour pf = new ProblemFour();
        pf.imprimir(1);
    }
}
