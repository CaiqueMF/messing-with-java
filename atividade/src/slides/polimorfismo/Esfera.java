package slides.polimorfismo;

public class Esfera {
    Ponto3d centro = new Ponto3d();
    int raio;

    public float calcularArea(){
        return (float) (4*Math.PI*raio*raio);
    }

    public float calcularVolume(){
        return (float) (4 * Math.PI*raio*raio*raio/3);
    }
}
