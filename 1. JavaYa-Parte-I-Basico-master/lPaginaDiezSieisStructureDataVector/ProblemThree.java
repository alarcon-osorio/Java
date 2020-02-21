package lPaginaDiezSeisStructureDataVector;

import java.util.*;

public class ProblemThree {
    private Scanner teclado;
    private int[] sueldosManana, sueldosTarde;
    
    public void inicializar(){
        teclado = new Scanner(System.in);        
    }
        
    public void turnoManana(){
        sueldosManana = new int[4];
        System.out.println("Jornada Mañana");
        int contador = 0;
        for (int i = 0; i < 4; i++) {
            contador += 1;
            System.out.print("Ingrese sueldo empleado: "  + contador + ": ");
            sueldosManana[i] = teclado.nextInt();            
        }
    }
    
    public void turnoTarde(){
        sueldosTarde = new int[4];
        System.out.println("Jornada Tarde");
        int contador = 0;
        for (int i = 0; i < 4; i++) {
            contador += 1;
            System.out.print("Ingrese sueldo empleado: "  + contador + ": ");
            sueldosTarde[i] = teclado.nextInt();
        }
    }
    
    public void imprimirSueldosManana(){
        System.out.println("-----------");
        for (int i = 0; i < 4; i++) {
            System.out.println("Turno Mañana: " + sueldosManana[i]);            
        }        
    }
    
    public void imprimirSueldosTarde(){
        System.out.println("------------");
        for (int i = 0; i < 4; i++) {
            System.out.println("Turno Tarde: " + sueldosTarde[i]);            
        }        
    }
    
    public void gastos(){
        int man, tar;
        man = 0;
        tar = 0;
        for (int i = 0; i < 4; i++) {
            man = man + sueldosManana[i];
            tar = tar + sueldosTarde[i];
        }
        System.out.println("Total de sueldo pagado a Jornada Mañana: " + man);
         System.out.println("Total de sueldo pagado a Jornada Tarde: " + tar);
    }
    
    public static void main(String[] args) {
        ProblemThree turnos = new ProblemThree();
        turnos.inicializar();
        turnos.turnoManana();
        turnos.turnoTarde();
        turnos.imprimirSueldosManana();
        turnos.imprimirSueldosTarde();
        turnos.gastos();
    }
}
