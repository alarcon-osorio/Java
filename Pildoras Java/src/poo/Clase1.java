package poo;
//Video 47 - Modificadores de acceso
public class Clase1 { //ya que no hay constructor asume que hay uno por defecto
    protected int mivar = 5;
    protected int mivar2 = 7;

    protected String miMetodo(){  // sin modificador de acceso
        return "El valor de mivar2 es: " + mivar2;
    }
}
