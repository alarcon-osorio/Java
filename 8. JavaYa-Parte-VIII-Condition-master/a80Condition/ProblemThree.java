package a80Condition;

public class ProblemThree {
    public static void main(String[] ar) {
        for (int f = 1; f <= 100; f++)
            System.out.println(f % 3 == 0 && f % 5 == 0 ? "FizzBuzz" : (f % 3 == 0 ? "Fizz" : (f % 5 == 0 ? "Buzz" : f)));
    }
}
