package slides.polimorfismo;

public class Circulo {
    Ponto2d centro;
    int raio;

    public float obterArea(){
        float area = (float) (Math.PI*raio*raio);
        return area;
    }
}
