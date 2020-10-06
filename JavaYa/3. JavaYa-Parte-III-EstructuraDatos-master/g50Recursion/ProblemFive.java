package g50Recursion;

public class ProblemFive {
    
    int factorial(int fact) {
        if (fact > 0) {
            int valor = fact * factorial(fact -1);
            System.out.println("Factorial es: " + fact + " * ");                      
            return valor;
        }else{
            return 1;
        }
    }
    
    public static void main(String[] args) {
        ProblemFive pf = new ProblemFive();
        int f = pf.factorial(4);
        System.out.println("El factorial de 4 es " + f);
    }
    
}
