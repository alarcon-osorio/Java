package poo;

public class CocheVideo28_29_30 {

    private int ruedas;//con Private encapsulo esa propiedad
    private int largo;//cm
    private int ancho;//cm
    private int motor;//cm3
    private int peso;//kg - entero
    String color;
    int peso_total;
    boolean asientosCuero, climatizador;

    //Crear metodo constructor (Inicializamos objetos)
    public CocheVideo28_29_30(){
        ruedas = 4;
        largo = 200;
        ancho = 300;
        motor = 1600;
        peso = 500;
    }

    // Getter
    //modificado_acceso + tipo_dato + nombre_metodo
    public String obtenerLargo() {
        return largo + " cms de largo";
    }

    //Setter
    public void estableceColor() {
        color = "azul";
    }

    //Getter
    //Informa el color
    public String ObtieneColor() {
        return "El color del coche es " + color;
    }


}
