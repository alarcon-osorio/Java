package a80Condition;

public class ProblemTwo {
    public static void main(String[] ar) {
        for (int f = 1; f <= 100; f++)
            System.out.println(f + " es " + (f % 2 == 0 ? "par" : "impar"));
    }
}
