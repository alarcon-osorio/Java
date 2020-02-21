package d74CollectionsArrayList.ProblemTwo;

import java.util.ArrayList;
import java.util.Collections;

public class Mazo {
    private ArrayList<Carta> cartas;

    Mazo() {
        cartas = new ArrayList<Carta>(8);
        cartas.add(new Carta(1, Carta.Palo.TREBOL));
        cartas.add(new Carta(2, Carta.Palo.TREBOL));
        cartas.add(new Carta(1, Carta.Palo.DIAMANTE));
        cartas.add(new Carta(2, Carta.Palo.DIAMANTE));
        cartas.add(new Carta(1, Carta.Palo.PICA));
        cartas.add(new Carta(2, Carta.Palo.PICA));
        cartas.add(new Carta(1, Carta.Palo.CORAZON));
        cartas.add(new Carta(2, Carta.Palo.CORAZON));
    }

    public void imprimir() {
        for (Carta carta : cartas)
            carta.imprimir();
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }

    public static void main(String[] ar) {
        Mazo mazo = new Mazo();
        System.out.println("Mazo de cartas ordenado");
        mazo.imprimir();
        mazo.barajar();
        System.out.println("Mazo de cartas despues de barajar");
        mazo.imprimir();
    }

}
