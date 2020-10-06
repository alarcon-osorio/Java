package g50Recursion;

public class ProblemOne {
    
    void repetir() {
        repetir();
    }
    public static void main(String[] args) {
        ProblemOne po = new ProblemOne();
        po.repetir();
    }
}
