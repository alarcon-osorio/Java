package poo;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

//Video 45 - Teoria Abstracts I
//Video 45 - Practica Abstracts II
public class PersonaUso {
    public static void main(String[] args) {
        Persona[] lasPersonas = new Persona[2];
        lasPersonas[0] = new Empleado2("Jeison", 6500.000000,2010,01,01);
        lasPersonas[1] = new Alumno("petro","Ciencias");

        for(Persona p: lasPersonas){
            System.out.println(p.getNombre() + ", " +  p.getDescripcion());
        }
    }
}

abstract class Persona {

    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract String getDescripcion(); //Siempre que el metodo sea abstract la clase sera abstract
}



class Empleado2 extends Persona{   //Hay que reescribir el metodo abstract - linea 56

    private double billing;  // Tipos primitivos
    private Date altaContrato; // Tipos de objetos

    public Empleado2(String name, double billing, int year, int mes, int dia) {
        super(name);
        this.billing = billing;
        GregorianCalendar calendaro = new GregorianCalendar(year, mes -1, dia);
        altaContrato =  calendaro.getTime();
    }

    public double getSueldo(){
        return billing;
    }

    public Date obtenerFechaContrato(){
        return altaContrato;
    }

    public void estableSueldo(double porcentaje){
        double aumento = billing * porcentaje/100;
        billing += aumento;
    }

    //Metodo Sobre escrito
    public String getDescripcion() {
        return "Este empleado tiene un sueldo = " + billing;
    }

}

class Alumno extends Persona {

    private String carrera;

    public Alumno(String nombre, String carrera){
        super(nombre);
        this.carrera = carrera;
    }

    //Es abstract y aqui se sobre escribe
    public String getDescripcion() { //Metodo sobre escrito -- hace diferentes funciones
        return "El Alumno esta estudiando la carrera " + carrera;
    }

}

