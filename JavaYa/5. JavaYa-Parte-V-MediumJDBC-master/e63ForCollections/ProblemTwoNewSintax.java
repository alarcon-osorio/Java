package e63ForCollections;

public class ProblemTwoNewSintax {
    public static void main(String[] args) {
        int[] sueldos = {100, 200, 300};
        for (int monto: sueldos) {
            System.out.println("Sueldo: " + monto);
        }
        int gastos = 0;
        for (int monto: sueldos){
            gastos += monto;
        }
        System.out.println("TOTAL: ");
        System.out.println("Gastos: " + gastos);
    }
}
