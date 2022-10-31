package polimofismo.animais;

public class Cavalo extends Animal implements Corredor{
    @Override
    public void emitirSom() {
        System.out.println("som de cavalo");
    }

    @Override
    public void correr() {
        System.out.println("correu");
    }
}
