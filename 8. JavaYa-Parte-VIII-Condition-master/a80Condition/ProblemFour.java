package a80Condition;

public class ProblemFour {
    public static void main(String[] ar) {
        for (int f = 1; f <= 100; f++)
            if (f % 3 == 0 && f % 5 == 0)
                System.out.println("FizzBuzz");
            else 
                if (f % 3 == 0)
                    System.out.println("Fizz");
                else 
                    if (f % 5 == 0)
                        System.out.println("Buzz");
                    else
                        System.out.println(f);
    }
}
