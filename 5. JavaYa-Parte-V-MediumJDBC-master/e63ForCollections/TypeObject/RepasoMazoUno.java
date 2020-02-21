package e63ForCollections.TypeObject;

public class RepasoMazoUno {
    Carta []cartas;
    
    RepasoMazoUno() {
        cartas = new Carta[6];
        cartas[0] = new Carta(1,"Rey");
        cartas[1] = new Carta(2,"Mazo");
        cartas[2] = new Carta(3,"Reina");
        cartas[3] = new Carta(4,"Pica");
        cartas[4] = new Carta(5,"Trebol");
        cartas[5] = new Carta(6,"Corazón");
    }
    
    public void imprimir() {
        System.out.println("Listado de cartas");
        for (Carta carta: cartas) {
            carta.imprimir();
        }
    }
    
    public void alAzar() {
        System.out.println("Carta al Azar");
        cartas[(int)(Math.random()* 6)].imprimir();
    }
    
    public static void main(String[] args) {
        RepasoMazoUno rmu = new RepasoMazoUno();
        rmu.imprimir();
        rmu.alAzar();
    }
    
}
