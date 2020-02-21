package i67Enum.ProblemTwo;

public class PruebaEnum {
    
    public void imprimir() {
        System.out.println("--- FOR ADAPTADO ---");
        for (Mes mes: Mes.values()) {
            System.out.println(mes + " " + mes.retornarNumero());
        }
    }
    
    public void imprimirFor() {
        Mes[] meses = Mes.values();
        System.out.println("--- FOR TRADICIONAL---");
        for (int i = 0; i < meses.length; i++) {
            System.out.println(meses[i] + " " + meses[i].retornarNumero());
        }
    }
    
    public static void main(String[] args) {
        PruebaEnum prueba = new PruebaEnum();
        prueba.imprimir();
        prueba.imprimirFor();
        System.out.println("--- SOLO UN MES ---");
        Mes mes1 = Mes.ENERO;
        System.out.println(mes1 + " " + mes1.retornarNumero());
    }    
}
