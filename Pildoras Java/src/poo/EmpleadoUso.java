package poo;

import java.util.*;

public class EmpleadoUso {

    public static void main(String[] args) {


    }
}

//Video 33 -- solo una clase debe ser publica y solo una debe ser main
class Empleado{
    private String name; // Tipos de objetos
    private double billing;  // Tipos primitivos
    private Date altaContrato; // Tipos de objetos

    // Constructor con parametros
    //Video 34 - uso de GreforianCalendar
    public Empleado(String name, double billing, int year, int mes, int dia) {
        this.name = name;
        this.billing = billing;
        GregorianCalendar calendaro = new GregorianCalendar(year, mes -1, dia); //Video 33 - Enero es 1 - 1 = 0 para controlarlo
        altaContrato =  calendaro.getTime(); //Video 33 - Intro Herencia
    }

    //Video 34 - Metodo Getter
    public String obtenerNombre(){
        return name;
    }

    //Video 34 - Metodo Getter
    public double obtenerSueldo(){
        return billing;
    }

    //Video 34 - Metodo Getter
    public Date obtenerFechaContrato(){
        return altaContrato;
    }

    //Video 34 - Meotodo Setter
    public void estableNombre(){

    }

    //Video 34 - Meotodo Setter
    public void estableSueldo(double porcentaje){
        double aumento = billing * porcentaje/100;
        billing += aumento;
    }

    //Video 34 - Meotodo Setter
    public void estableFechaContrato(){

    }




}
