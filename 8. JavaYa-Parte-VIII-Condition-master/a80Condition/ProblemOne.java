package a80Condition;

public class ProblemOne {
    public static void main(String[] ar) {
        for (int f = 0; f < 10; f++) {
            int aleatorio = (int) (Math.random() * 50) + 1;
            System.out.println("El valor " + aleatorio + " tiene " + (aleatorio < 10 ? "1 dígito" : "2 dígitos"));
        }
    }
}
