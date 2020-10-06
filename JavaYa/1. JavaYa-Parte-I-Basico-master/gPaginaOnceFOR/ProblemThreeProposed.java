package PaginaOnceFOR;


public class ProblemThreeProposed {
    public static void main(String[] args) {
        int contador = 0;
        
        for (int i = 5; i <= 50; i += 5) {
            contador += 1;
            System.out.println("5 X " + contador + " = " + i);
        }
    }
}
