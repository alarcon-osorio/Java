package k69GenericClass;

public class Persona {
    
    private String nombre;
    private int edad;
    
    public Persona(String name, int age) {
        this.nombre = name;
        this.edad = age;
    }
    
    public void imprimir() {
        System.out.println(nombre + " " + edad );
    }
    
}
