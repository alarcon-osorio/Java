package d62Switch;

public class ProblemThree {
    public static void main(String[] args) {
        int pares = 0;
        int impares = 0;
        for (int i = 0; i < 1000; i++) {
            int dado = (int)(Math.random() * 6 ) + 1;
            switch (dado) {
                case 1:
                case 3:
                case 5:
                    impares++;
                    break;
                case 2:
                case 4:                    
                case 6:
                    pares++;
                    break;
            }
        }
        
        System.out.println("Cantidad de veces que salieron pares: " + pares);
        System.out.println("Cantidad de veces que salieron impares: " + impares);
    }
}
