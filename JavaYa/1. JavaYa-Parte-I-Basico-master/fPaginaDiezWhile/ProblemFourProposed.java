package fPaginaDiezWhile;

    public class ProblemFourProposed {
    public static void main(String[] ar) {
        int x, termino;
        x = 1;
        termino = 11;
        while (x <= 25) {
            System.out.print(termino);
            System.out.print(" - ");
            x += 1; //1+1 = 2 hasta cuando x <= 25
            termino += 11;  //11 + 11 Va de 11 en 11 repetidas 25 veces
        }
    }
}
