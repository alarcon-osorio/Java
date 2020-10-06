package yVeintiNueveHerency.ProblemOne;

public class Prueba {
    public static void main(String[] args) {
        Suma sum = new Suma();
        sum.cargar1();
        sum.cargar2();
        sum.operar();
        System.out.print("El resultado de la suma es: ");
        sum.mostrarResultado();
        Resta subtraction = new Resta();
        subtraction.cargar1();
        subtraction.cargar2();
        subtraction.operar();
        System.out.print("El resultado de la resta es: ");
        subtraction.mostrarResultado();
    }
}
