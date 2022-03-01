package ex01.Bidimensional;

public class Circulo extends FormaBidimensional {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double obterArea() {
        return Math.PI * Math.pow(raio, 2);
    }
}
