package g65MethodsStatics.ProblemTwo;

public class Persona {    
    private String nombre;
    int edad;
    
    public Persona(String name, int age) {
        this.nombre = name;
        this.edad = age;
    }
    
    public void imprimir() {
        System.out.println(nombre + " - " + edad);
    }
    
    public static Persona mayor(Persona per1, Persona per2) {
        if (per1.edad > per2.edad) {
            return per1;
        }else{
            return per2;
        }
    }
        
}
