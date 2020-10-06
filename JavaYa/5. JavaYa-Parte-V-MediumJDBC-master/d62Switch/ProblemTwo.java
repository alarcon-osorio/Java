package d62Switch;

public class ProblemTwo {
    public static void main(String[] args) {
        int cant1=0;
        int cant5=0;
        int cant10=0;
        int otros=0;
        for (int i = 0; i < 100; i++) {
            int valor = (int)(Math.random() * 10) + 1;
            switch(valor){
                case 1:
                    cant1++;
                    break;
                case 5:
                    cant5++;
                    break;
                case 10:
                    cant10++;
                    break;
                default:
                    otros++;
            }
        }
        System.out.println("Cantidad de veces que salieron 1: " + cant1);
        System.out.println("Cantidad de veces que salieron 5: " + cant5);
        System.out.println("Cantidad de veces que salieron 10: " + cant10);
        System.out.println("Cantidad de veces que no salieron 1,5 o 10: " + otros);        
    }
}
