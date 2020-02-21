package a80Condition;

public class ProblemOneProposedJavaYa {
    public static void main(String[] args) {
        String[] alumnos = { "juan", "ana", "luis", "carla", "pedro", "laura", "maria" };
        int[] notas = { 3, 7, 10, 9, 2, 8, 5 };
        String[] estados = new String[notas.length];
        for (int f = 0; f < notas.length; f++)
            estados[f] = notas[f] >= 4 ? "regular" : "libre";
        for (int f = 0; f < notas.length; f++)
            System.out.println(alumnos[f] + " tiene una nota " + notas[f] + " esta " + estados[f]);
    }
}