package poo;
// Video 40 - Herencia 1
public class Furgoneta extends Coche{
    private int capacidadCarga;
    private int plazasExtra;

    //Cosntructor
    public Furgoneta(int plazasExtra, int capacidadCarga){
        super(); //Lama al constructor de la clase padre - Es decir del heredado.
        this.plazasExtra = plazasExtra;
        this.capacidadCarga = capacidadCarga;
    }

}
