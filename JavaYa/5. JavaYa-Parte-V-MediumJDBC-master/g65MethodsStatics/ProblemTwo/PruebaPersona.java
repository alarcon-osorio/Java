package g65MethodsStatics.ProblemTwo;

public class PruebaPersona {
    
    public static void main(String[] args) {
        Persona per1 = new Persona("Jeison", 30);
        Persona per2 = new Persona("Juan", 20);
        per1.imprimir();
        per2.imprimir();
        Persona personaMayor = Persona.mayor(per1, per2);
        System.out.println("Persona con mayor edad");
        personaMayor.imprimir();
    }
    
}
