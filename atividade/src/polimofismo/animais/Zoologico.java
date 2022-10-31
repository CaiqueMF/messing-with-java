package polimofismo.animais;

public class Zoologico {
    Animal [] jaulas = new Animal[10];

    public Zoologico() {
        jaulas[0] = new Cavalo();
        jaulas[1] = new Cachorro();
        jaulas[2] = new Preguica();

        for (int i = 0; i < jaulas.length; i++) {
            if (jaulas[i]!=null){
                jaulas[i].emitirSom();
                if(jaulas[i] instanceof Corredor){
                    ((Corredor)jaulas[i]).correr();
                }
            }

        }
    }
}
