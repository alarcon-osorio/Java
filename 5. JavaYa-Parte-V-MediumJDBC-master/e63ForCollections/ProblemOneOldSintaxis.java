package e63ForCollections;

public class ProblemOneOldSintaxis {
    public static void main(String[] args) {
        int [] sueldos = {200,300,400};
        for (int i = 0; i < sueldos.length; i++) {
            System.out.println("Sueldos: " + sueldos[i]);
        }
        int gastos = 0;
        for (int i = 0; i < sueldos.length; i++) {
            gastos += sueldos[i];
            
        }
        System.out.println("TOTAL");
        System.out.println("Gastos Totales: " + gastos);
    }
    
    
}
