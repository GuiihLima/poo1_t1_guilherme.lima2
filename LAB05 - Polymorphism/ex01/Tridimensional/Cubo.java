package ex01.Tridimensional;

public class Cubo extends FormaTridimensional {
    private double aresta;

    public Cubo(double aresta) {
        this.aresta = aresta;
    }

    public double obterArea() {
        return 6 * Math.pow(aresta, 2);
    }

    public double obterVolume() {
        return Math.pow(aresta, 3);
    }
}
