package g65MethodsStatics.ProblemTwo;


public class PersonaTwo {
    private String nombre;
    private int edad;
    
    PersonaTwo(String name, int age) {
        this.nombre = name;
        this.edad = age;
    }
    
    public void imprimir() {
        System.out.println(nombre + " " + edad);
    }
    
    public PersonaTwo mayor(PersonaTwo per) {
        if (this.edad >= per.edad) {
            return this;
        }else{
            return per;
        }
    }
}
