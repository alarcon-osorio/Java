package poo;

public class CocheVideo28_29_30_31 {

    private int ruedas;//con Private encapsulo esa propiedad
    private int largo;//cm
    private int ancho;//cm
    private int motor;//cm3
    private int peso;//kg - entero
    private String color;
    private int peso_total;
    private boolean asientosCuero, climatizador;

    //Crear metodo constructor (Inicializamos objetos)
    public CocheVideo28_29_30_31(){
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

    //Setter con parametro
    public void establecerAsientos(String asientosCuero) {
        if(asientosCuero == "si") {
            this.asientosCuero = true;
        }else{
            this.asientosCuero = false;
        }
    }

    //Getter para el Setter de arriba
    public String obtenerAsientos() {
        if(asientosCuero == true){
            return "Tiene asientos de cuero";
        }else{
            return "No tiene asientos de cuero";
        }

    }


}
