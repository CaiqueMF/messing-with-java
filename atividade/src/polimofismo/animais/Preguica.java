package polimofismo.animais;

public class Preguica extends Animal{
    @Override
    public void emitirSom() {
        System.out.println("som de preguica");
    }

    public void subirArvore(){
        System.out.println("subiu na arvore");
    }
}
