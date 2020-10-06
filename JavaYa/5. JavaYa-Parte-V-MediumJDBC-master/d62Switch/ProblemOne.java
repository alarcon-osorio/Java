package d62Switch;

public class ProblemOne {

    public static void main(String[] args) {
        int lado1 = 0;
        int lado2 = 0;
        int lado3 = 0;
        int lado4 = 0;
        int lado5 = 0;
        int lado6 = 0;
        for (int i = 0; i < 1000; i++) {

            int dado = (int) (Math.random() * 6) + 1;
            if (dado == 1) {
                lado1++;
            } else if (dado == 2) {
                lado2++;
            } else if (dado == 3) {
                lado3++;
            } else if (dado == 4) {
                lado4++;
            } else if (dado == 5) {
                lado5++;
            } else if (dado == 6) {
                lado6++;
            }
        }
        System.out.println("IF");
        System.out.println("1: " + lado1);
        System.out.println("2: " + lado2);
        System.out.println("3: " + lado3);
        System.out.println("4: " + lado4);
        System.out.println("5: " + lado5);
        System.out.println("6: " + lado6);
        System.out.println("----------------");
        System.out.println();
        System.out.println("SWITCH");

        for (int i = 0; i < 1000; i++) {
            int dado = (int) (Math.random() * 6) + 1;
            switch (dado) {
                case 1:
                    lado1++;
                    break;
                case 2:
                    lado2++;
                    break;
                case 3:
                    lado3++;
                    break;
                case 4:
                    lado4++;
                    break;
                case 5:
                    lado5++;
                    break;
                case 6:
                    lado6++;
                    break;
            }
        }
        System.out.println("1: " + lado1);
        System.out.println("2: " + lado2);
        System.out.println("3: " + lado3);
        System.out.println("4: " + lado4);
        System.out.println("5: " + lado5);
        System.out.println("6: " + lado6);
        System.out.println("----------------");
    }
}
