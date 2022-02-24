import java.util.*;

public class Retangulo {
    private Ponto firstPoint = new Ponto();
    private Ponto secondPoint = new Ponto();

    public void criaRetangulo(int point1, int point2) {
        firstPoint.defPontos(point1);
        secondPoint.defPontos(point2);
        // caso os pontos do retangulo tenham coordenadas que sejam iguais na extremidades
    }

    public void criaRetangulo(int x1, int y1, int x2, int y2) {
        firstPoint.defPontos(x1, y1);
        secondPoint.defPontos(x2, y2);
        // define os pontos das extremidades do retangulo caso tenham coordenadas diferentes
    }

    public float mostraArea() {
        int x1 = firstPoint.x;
        int y1 = firstPoint.y;
        int x2 = secondPoint.x;
        int y2 = secondPoint.y;
        float area = (x2 - x1) * (y2 - y1);// check:use Math.abs
        return area;
    }

    public static void main(String[] args) {
        Retangulo novoRetangulo = new Retangulo();
        System.out.println("Informe os pontos que definem um retangulo: ");
        try (Scanner scanner = new Scanner(System.in)) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();
            if (x1 == y1 && x2 == y2) {
                novoRetangulo.criaRetangulo(x1, x2);
            } else {
                novoRetangulo.criaRetangulo(x1, y1, x2, y2);
            }
        }
        System.out.println("O retangulo tem area igual a: " + novoRetangulo.mostraArea());
    }
}
