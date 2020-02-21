package yVeintiNueveHerency.ProblemOneProposed;

public class Ejecutar {
    public static void main(String[] args) {
        Persona person = new Persona();
        person.cargarDatos();        
        Empleado employ = new Empleado();
        employ.cargarDatos();
        employ.cargarSueldo();
        person.imprimir();// IMPRIME DATOS DE LA PERSONA 
        employ.imprimir();// IMPRIME DATOS DE UN EMPLEADO
        employ.imprimirSueldo();
    }
}
