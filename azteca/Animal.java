package azteca;

abstract class Animal{
    public abstract void Sonido();
    public abstract void Correr();

    public void Caminar(){
        System.out.println("Estoy caminando...");
    }

}

public class Gato extends Animal{
    public Gato(){
        this.Caminar();
    }
    public void Sonido() {
    }

    public void Correr() {
    }
}
