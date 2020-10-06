package PaginaOnceFOR;

import java.util.Scanner;

public class ProblemThree {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int aprobados, reprobados, nota;
        
        aprobados = 0;
        reprobados = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.println("Ingrese la nota del estudiante " + i);
            nota = teclado.nextInt();
            
            if (nota >= 7) {
                aprobados += 1;
            }else{
                reprobados +=1;
            }
        }
        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de reprobados: " + reprobados);
    }
}
