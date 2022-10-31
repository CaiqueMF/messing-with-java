package slides.polimorfismo;

public class Quadrilatero {
    String nome;
    Ponto2d [] arestas = new Ponto2d[4];

    public float calcularArea(){
        return (arestas[3].x-arestas[0].x)*(arestas[1].y-arestas[0].y);
    }
}
