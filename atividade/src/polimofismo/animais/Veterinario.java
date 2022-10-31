package polimofismo.animais;

public class Veterinario {
    public void examinar(Animal cliente){
        cliente.emitirSom();
        if (cliente instanceof Cachorro){
            System.out.println("e um cachorro");
        } else if (cliente instanceof Cavalo) {
            System.out.println("e um cavalo");
        } else if (cliente instanceof Preguica) {
            System.out.println("e uma preguica");
        }
    }
}
