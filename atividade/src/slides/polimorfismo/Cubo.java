package slides.polimorfismo;

public class Cubo {
    Quadrilatero [] faces = new Quadrilatero[6];

    public float calcularArea(){
        float area=0;
        for (int i = 0; i < faces.length; i++) {
            area+=faces[i].calcularArea();
        }
        return area;
    }

    public float calcularvolume(){
        return faces[0].calcularArea()*(faces[1].arestas[1].y-faces[1].arestas[0].y);
    }

}
