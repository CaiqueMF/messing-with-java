package polimofismo.animais;

public class Main {
    public static void main(String[] args) {
        Animal [] lista= new Animal[3];
        lista[0] = new Cachorro();
        lista[1] = new Cavalo();
        lista[2] = new Preguica();

        for (int i = 0; i < lista.length; i++) {
            lista[i].emitirSom();
        }

        Zoologico teste = new Zoologico();
    }
}
