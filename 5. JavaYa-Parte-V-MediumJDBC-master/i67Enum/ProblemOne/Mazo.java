package i67Enum.ProblemOne;


public class Mazo {
    private Carta []carta;
    
    Mazo() {
        carta = new Carta[8];
        carta[0] = new Carta( 1,Carta.Operaciones.TREBOL);
        carta[1] = new Carta( 2,Carta.Operaciones.CORAZON);
        carta[2] = new Carta( 3,Carta.Operaciones.TREBOL);
        carta[3] = new Carta( 4,Carta.Operaciones.TREBOL);
        carta[4] = new Carta( 5,Carta.Operaciones.TREBOL);
        carta[5] = new Carta( 6,Carta.Operaciones.TREBOL);
        carta[6] = new Carta( 7,Carta.Operaciones.TREBOL);
        carta[7] = new Carta( 8,Carta.Operaciones.TREBOL);        
    }
    
    public void imprimir() {
        System.out.println("Listado completo de Cartas");
        for (Carta carta: carta) {
            carta.imprimir();
        }
    }
    
    public void sacarUnaCarta(){
        System.out.println("Carta al Azar");
        Carta cartas = carta[(int)(Math.random() * 8)];
        cartas.imprimir();
        switch(cartas.retornarOperacion()){
            case CORAZON:
            System.out.println("Gana 4 puntos");
            break;
        case DIAMANTE:
            System.out.println("Gana 3 puntos");
            break;
        case PICA:
            System.out.println("Gana 2 puntos");
            break;
        case TREBOL:
            System.out.println("Gana 1 puntos");
            break;
        }
    }
    
    public static void main(String[] args) {
        Mazo mazo = new Mazo();
        mazo.imprimir();
        mazo.sacarUnaCarta();
    }
}
