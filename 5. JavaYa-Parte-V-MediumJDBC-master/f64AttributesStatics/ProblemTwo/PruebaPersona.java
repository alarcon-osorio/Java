package f64AttributesStatics.ProblemTwo;

public class PruebaPersona {    
    public static void main(String[] args) {
        System.out.println("El valor del atributo estatico es: " + Persona.cantidad);
        Persona per1 = new Persona("Jeison",30);
        per1.imprimir();
        System.out.println("El valor del atributo estatico es: " + Persona.cantidad);
        Persona per2 = new Persona("Oscar",30);
        per2.imprimir();
        System.out.println("El valor del atributo estatico es: " + Persona.cantidad);
        Persona per3 = new Persona("Pedro",30);
        per3.imprimir();
    }
    
}
