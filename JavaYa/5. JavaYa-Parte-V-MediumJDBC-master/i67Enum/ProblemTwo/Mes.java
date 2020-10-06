package i67Enum.ProblemTwo;

public enum Mes {
        ENERO(1), FEBRERO(2), MARZO(3), ABRIL(4);
        private final int numero;

    Mes(int numero) {
        this.numero = numero;
    }

    public int retornarNumero(){
        return numero;
    }
}
