package ex01;

import ex01.Bidimensional.*;
import ex01.Tridimensional.*;

public class Prog {
    public static void main(String[] args) {
        Forma[] f = {
                new Circulo(4),
                new Quadrado(6),
                new Triangulo(3, 2),
                new Esfera(5),
                new Cubo(7),
                new Tetraedro(4)
        };

        for (int i = 0; i < f.length; i++) {
            String objeto = String.format("%s", f[i].getClass());
            objeto = objeto.substring(25);
            System.out.printf("Forma:\t%s\n", objeto.replace(".", ""));
            System.out.printf("Área:\t%.2f\n", f[i].obterArea());
            if(f[i] instanceof FormaTridimensional){
                System.out.printf("Volume:\t%.2f\n", f[i].obterVolume());
            }
            System.out.println();
        }
    }
}