package ex01.Tridimensional;

public class Tetraedro extends FormaTridimensional {
    private double lado;

    public Tetraedro(double lado) {
        this.lado = lado;
    }

    public double obterArea() {
        return Math.sqrt(3) * Math.pow(lado, 2);
    }

    public double obterVolume() {
        return (Math.pow(lado, 3) * Math.sqrt(2)) / 12;
    }
}
