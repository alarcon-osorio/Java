package PaginaDiezWhile;

import java.util.*;

public class ProblemOneProposed {
    public static void main(String[] ar) {
        Scanner teclado = new Scanner(System.in);
        int x, nota, conta1, conta2;
        x = 1;
        conta1 = 0;
        conta2 = 0;
        while (x <= 10) {
            System.out.print("Ingrese nota:");
            nota = teclado.nextInt();
            if (nota >= 7) {
                conta1 = conta1 + 1;
            }else {
                conta2 = conta2 + 1;
            }
            x = x + 1;
        }
        System.out.println("Cantidad de alumnos con notas mayores o iguales a 7: " + conta1);
        System.out.println("Cantidad de alumons con notas menores a 7: " + conta2);
    }
}
