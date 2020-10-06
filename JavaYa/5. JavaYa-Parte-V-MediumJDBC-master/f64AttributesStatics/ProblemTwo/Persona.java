package f64AttributesStatics.ProblemTwo;

public class Persona {
    
    private String nombre;
    private int edad;
    public static int cantidad;
    
    public Persona(String nombre, int edad) {
         this.nombre = nombre;
         this.edad = edad;
         cantidad++;
    }
    
    public void imprimir() {
        System.out.println("El nombre de la persona es: " + nombre);
        System.out.println("La edad de la persona es: " + edad);
    }
}
