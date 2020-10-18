package poo;

public class Coche {

    private int ruedas;//con Private encapsulo esa propiedad
    private int largo;//cm
    private int ancho;//cm
    private int motor;//cm3
    private int peso;//kg - entero
    private String color;
    private int pesoTotal;
    private boolean asientosCuero, climatizador;

    //Crear metodo constructor (Inicializamos objetos)
    public Coche(){
        ruedas = 4;
        largo = 2000;
        ancho = 3000;
        motor = 1600;
        peso = 500;
    }

    // Getter
    //modificado_acceso + tipo_dato + nombre_metodo
    public String obtenerDatos() {
        return "Vehiculo tiene: " + ruedas + " ruedas\n" +
                "Mide " + largo/1000 + " metros\n" +
                "Ancho: " + ancho + " cms\n" +
                "Peso Plaraforma: " + peso + " Kilos";
    }

    //Setter  Video31 Paso de parametros
    public void establecerColor(String colorCoche) {
        // color = "azul"; Video 31
        color = colorCoche;
    }

    //Getter
    //Informa el color trabaja en conjunto con el Setter
    public String obtenerColor() {
        return "El color del coche es " + color;
    }

    //Video 31
    //Setter con parametro
    public void establecerAsientos(String asientosCuero) {
        if(asientosCuero.equalsIgnoreCase("si")) {
            this.asientosCuero = true;
        }else{
            this.asientosCuero = false;
        }
    }

    //Video 31
    //Getter para el Setter de arriba
    public String obtenerAsientos() {
        if(asientosCuero){  //Video 33 eliminacion de ==true ya que obvia
            return "Tiene asientos de cuero";
        }else{
            return "No tiene asientos de cuero";
        }

    }

    //Video32
    //Setter
    public void establecerClimatizador(String climatizador){
        if (climatizador.equalsIgnoreCase("si")){
            this.climatizador = true;
        }else{
            this.climatizador = false;
        }
    }

    //Video32
    //Getter
    public String obtenerClimatizador(){
        if (climatizador){ //Video 33 eliminacion de ==true ya que obvia
            return "Tiene aire acondicionado";
        }else{
            return "No tiene aire acondiconado";
        }
    }

    //Video32 Seter con Getter a la vez desaconsejado
    public String obtenerPesoCoche(){
        int pesoCarroceria = 500;
        pesoTotal = pesoTotal + pesoCarroceria;

        if(asientosCuero){ //Video 33 eliminacion de ==true ya que obvia
            pesoTotal=pesoTotal + 50;
        }

        if(climatizador){ //Video 33 eliminacion de ==true ya que obvia
            pesoTotal=pesoTotal + 20;
        }

        return "El peso del coche es " + pesoTotal;
    }

    //Video 32 Getter
    public int precioCoche(){
        int precioFinal = 10000;

        if (asientosCuero){ //Video 33 eliminacion de ==true ya que obvia
            precioFinal += 2000;
        }
        if (climatizador){ //Video 33 eliminacion de ==true ya que obvia
            precioFinal += 5000;
        }

        return precioFinal;
    }


}
