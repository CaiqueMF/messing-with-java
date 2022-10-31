package slides.polimorfismo;

public class Triangulo {
    Ponto2d [] arestas = new Ponto2d[3];

    public float calculaArea(){
        return (float) ((arestas[2].x-arestas[0].x)*(arestas[1].y-arestas[0].y)/2);
    }
}
