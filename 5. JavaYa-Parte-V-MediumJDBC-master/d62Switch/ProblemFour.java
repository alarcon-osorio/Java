
package d62Switch;


public class ProblemFour {
    public static void main(String[] args) {
        String [] dias = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
        int laborales = 0;
        int nolaborales = 0;
        for (int i = 0; i < dias.length; i++) {
            switch (dias[i]){
                case "Lunes":
                    laborales++;
                    break;
                case "Martes":
                    laborales++;
                    break;
                case "Miercoles":
                    laborales++;
                    break;
                case "Jueves":
                    laborales++;
                    break;
                case "Viernes":
                    laborales++;
                    break;
                case "Sabado":
                    nolaborales++;
                    break;
                default:
                    nolaborales++;
                    break;
            }
        }
        
        System.out.println("Cantidad de días que SI trabaja días hábiles: " + laborales);
        System.out.println("Cantidad de días que NO trabaja fin de semana: " + nolaborales);
    }
 
}
