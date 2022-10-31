package polimofismo.animais;

public class Cachorro extends Animal implements Corredor{
    @Override
    public void emitirSom() {
        System.out.println("auau");
    }
    public void correr(){
        System.out.println("correu");
    }
}
