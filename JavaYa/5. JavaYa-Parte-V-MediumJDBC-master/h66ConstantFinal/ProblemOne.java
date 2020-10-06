package h66ConstantFinal;


public class ProblemOne {
    private final double PI = 3.1416f;
    private double radio;
    
    public ProblemOne(double radio) {
        this.radio = radio;
    }
    
    public double perimetro() {
        return 2 * PI * radio;
    }
    
    public static void main(String[] args) {
        ProblemOne po = new ProblemOne(2.15);
        System.out.println(po.perimetro());
    }
    
}
