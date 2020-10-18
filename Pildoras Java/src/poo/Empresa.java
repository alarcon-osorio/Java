package poo;

import java.util.Arrays;

//Video 36 -- Constantes y constructores
public class Empresa {

    public static void main(String[] args) {
        Empleados empleado1 = new Empleados("Jeison");
        Empleados empleado2 = new Empleados("Pedro");
        Empleados empleado3 = new Empleados("Juan"); //Video 37

        empleado1.cambiaSeccion("RRHH");
        //empleado2.cambiaNombre("Paco"); //Agregar final delante del tipo de datos y variable

        System.out.println(empleado1.getNombre() + "\n" + empleado1.getSeccion() + "\n" + "El ID Es: " + empleado1.getId());
        System.out.println("-------");
        //Empleados.Id++; //Video 37 aumenta en uno el uso de Id Static
        System.out.println(empleado2.getNombre() + "\n" + empleado2.getSeccion() + "\n" + "El ID Es: " + empleado2.getId());
        //Video 37
        System.out.println("-------");
        //Empleados.Id++; //Video 37 aumenta en uno el uso de Id Static
        System.out.println(empleado3.getNombre() + "\n" + empleado3.getSeccion() + "\n" + "El ID Es: " + empleado3.getId());
        System.out.println("-------Getter getData");
        //Empleados.Id++; //Video 37 aumenta en uno el uso de Id Static
        System.out.println(empleado1.getData());
        //Video 38 - Meotodos Static
        System.out.println("-------Getter getData - Video 38");
        System.out.println(empleado1.getData() + "\n" + empleado2.getData() + "\n" + empleado3.getData());
        System.out.println(Empleados.getIdSiguiente());  // Imprime 4 ya que solo hay 3 empleados
    }

}

class Empleados {

    private final String nombre; //Lo convierto en constante para que no se pueda modificar mas adelante
    private String seccion;
    //Video 37 - Uso Static
    private int Id; //Para que sea usada por cada objeto
    private static int IdSiguiente = 1;

    public Empleados(String name) {
        this.nombre = name;
        seccion = "Administracion";
        this.Id = IdSiguiente; //Video 37
        IdSiguiente++; //Video 37
    }

    //Video 37 Retornar todos los datos Getter
    public String getData() {
        return "El nombre es: " + nombre + "\n"+
                "la seccion es: " + seccion + "\n" +
                "El ID es: " + IdSiguiente;
    }

    //Video 38 - Metodo Stais
    public static String getIdSiguiente(){
        return "El ID siguiente es: " + IdSiguiente;
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

    public int getId() {
        return Id;
    }
}
