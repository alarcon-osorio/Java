package poo;

import java.util.*;

public class EmpleadoUso {

    public static void main(String[] args) {
        //Video 35 -- Instancia de clases
        Empleado empleado1 = new Empleado("Jeison", 6500000, 2019, 01, 01 );
        Empleado empleado2 = new Empleado("Jose", 5000000, 2020, 01, 01 );
        Empleado empleado3 = new Empleado("Juan", 4500000, 2018, 12, 24 );

        //Video 35 -- Lamada a metodo estable sueldo
        empleado1.estableSueldo(5);
        empleado2.estableSueldo(5);
        empleado3.estableSueldo(5);

        System.out.println("Nombre = " + empleado1.obtenerNombre() + "\nSueldo: " + empleado1.obtenerSueldo() + "\nFecha de Ingreso: " + empleado1.obtenerFechaContrato());
        System.out.println();
        System.out.println("Nombre = " + empleado2.obtenerNombre() + "\nSueldo: " + empleado2.obtenerSueldo() + "\nFecha de Ingreso: " + empleado2.obtenerFechaContrato());
        System.out.println();
        System.out.println("Nombre = " + empleado3.obtenerNombre() + "\nSueldo: " + empleado3.obtenerSueldo() + "\nFecha de Ingreso: " + empleado3.obtenerFechaContrato());
        System.out.println();

        //Video 35 Datos por medio de array de clase Empleaso
        Empleado[] misEmpleados = new Empleado[3];

        misEmpleados[0] = new Empleado("Jeison", 6500000, 2019, 01,01);
        misEmpleados[1] = new Empleado("Jose", 5000000, 2020, 01,01);
        misEmpleados[2] = new Empleado("Juan", 4500000, 2018, 12,24);

        for(int i=0; i<misEmpleados.length;i++){
            misEmpleados[i].estableSueldo(5);
        }

        for (int i=0; i<misEmpleados.length;i++){
            System.out.println("Nombre: " + misEmpleados[i].obtenerNombre());
            System.out.println("Sueldo: " + misEmpleados[i].obtenerSueldo());
            System.out.println("Fecha Ingreso: " + misEmpleados[i].obtenerFechaContrato());
            System.out.println();
        }

        //Video 35 for mejorados
        for(Empleado e: misEmpleados){
            e.estableSueldo(5);
        }

        //Video 35 for mejorados
        for(Empleado e: misEmpleados){
            System.out.println("Nombre: " + e.obtenerNombre());
            System.out.println("Sueldo: " + e.obtenerSueldo());
            System.out.println("Fecha Ingreso: " + e.obtenerFechaContrato());
            System.out.println();
        }

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
    public void estableSueldo(double porcentaje){
        double aumento = billing * porcentaje/100;
        billing += aumento;
    }

}
