package slides.polimorfismo;

public class Piramide {
    Quadrilatero base;
    Triangulo [] lados = new Triangulo[4];

    public float CalcularArea(){
        float area = 0;
        for (Triangulo lado : lados) {
            area += lado.calculaArea();
        }
        area+= base.calcularArea();
        return area;
    }
}
