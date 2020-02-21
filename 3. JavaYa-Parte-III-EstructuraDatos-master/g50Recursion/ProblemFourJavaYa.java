package g50Recursion;

public class ProblemFourJavaYa {
    void imprimir(int x) {
        if (x>0) {
            imprimir(x-1);
            System.out.println(x);            
        }    
    }
    
    public static void main(String[] ar) {
        ProblemFourJavaYa re=new ProblemFourJavaYa();
        re.imprimir(5);
    }
}
