package g65MethodsStatics.ProblemTwo;

public class PruebaPersonaTwo {
    public static void main(String[] args) {
        PersonaTwo persona1 = new PersonaTwo("Jeison", 30);
        PersonaTwo persona2 = new PersonaTwo("Jeison", 30);
        persona1.imprimir();
        persona2.imprimir();
        PersonaTwo personaMayor = persona1.mayor(persona2);
        System.out.println("Persona con mayor edad");
        personaMayor.imprimir();
    }
}
