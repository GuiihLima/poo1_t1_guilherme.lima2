package ex01.Bidimensional;

public class Quadrado extends FormaBidimensional {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double obterArea() {
        return Math.pow(lado, 2);
    }
}
