package e63ForCollections;

public class ProblemOneOldSintaxisJavaYa {

    public static void main(String[] args) {
        int []sueldos= {2000, 6000, 7000, 4300};
        for(int f=0;f<sueldos.length;f++)
            System.out.println("Sueldo: "+sueldos[f]);
        int gastos=0;
        for(int f=0;f<sueldos.length;f++) 
            gastos+=sueldos[f];
        System.out.println("Gasto total en sueldos de la empresa: "+gastos);
    }

}
