package poo;

import java.util.Arrays;

//Video 36 -- Constantes y constructores
public class Empresa {

    public static void main(String[] args) {
        Empleados empleado1 = new Empleados("Jeison");
        Empleados empleado2 = new Empleados("Pedro");

        empleado1.cambiaSeccion("RRHH");
        //empleado2.cambiaNombre("Paco"); //Agregar final delante del tipo de datos y variable

        System.out.println(empleado1.getNombre() + "\n" + empleado1.getSeccion());
        System.out.println("-------");
        System.out.println(empleado2.getNombre() + "\n" + empleado2.getSeccion());
    }

}

class Empleados {

    private final String nombre; //Lo convierto en constante para que no se pueda modificar mas adelante
    private String seccion;

    public Empleados(String name) {
        this.nombre = name;
        seccion = "Administracion";
    }

    //Metodo Getter y Setter autogenerados por medio del IDE
    public String getNombre() {
        return "El nombre es: " + nombre;
    }

    /*
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    */

    public String getSeccion() {
        return "La seccion es: " + seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public void cambiaSeccion(String seccion) {
        this.seccion = seccion;
    }

    //Video36 - No se puede cambiar el nombre
    /* -- Aparece error ya que el nombre no se deberia modficar
    public void cambiaNombre(String name) {
        this.nombre = name;
    }
     */
}
