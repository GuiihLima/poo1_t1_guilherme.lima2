package ex01.Tridimensional;

public class Esfera extends FormaTridimensional {
    private double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }

    public double obterArea() {
        return 4 * Math.PI * Math.pow(raio, 2);
    }

    public double obterVolume() {
        return (4 / 3) * Math.PI * Math.pow(raio, 3);
    }
}
