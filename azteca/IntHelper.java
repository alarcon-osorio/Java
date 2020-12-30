package azteca;

import java.util.Arrays;

public class IntHelper{

    public static void main(String args[]) {
        topTwoArray(new int[]{20, 34, 21, 87, 92}); // maximos: 92 y 87
        topTwoArray(new int[]{0, -100, -2}); // maximos: 0 y -2
        topTwoArray(new int[]{2000, 0, 23, 234, 2000}); // maximos: 2000 y 2000
    }

    public static void topTwoArray(int[] numbers) {
        int max1 = 0;
        int max2 = 0;

        int result;

        result = Math.max(max1,max2);

        System.out.println("Array : "+ Arrays.toString(numbers));
        if(result < max1){
            System.out.println("Primer maximo : " + max1);
        }else{
            System.out.println("Segundo maximo : " + max2);
        }

    }

}
