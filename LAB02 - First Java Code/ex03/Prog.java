package ex03;

import java.util.ArrayList;
import java.util.Scanner;

public class Prog {
    public static void main(String[] args) {
        ArrayList<Ponto> pontos = new ArrayList<Ponto>();
        try (Scanner scan = new Scanner(System.in)) {

            System.out.print("Número de pontos: ");
            int qtd = scan.nextInt();

            for (int i = 0; i < qtd; i++) {
                System.out.printf("\n%d° ponto:\n", i + 1);
                System.out.print("Digite o valor de x: ");
                int px = scan.nextInt();
                System.out.print("Digite o valor de y: ");
                int py = scan.nextInt();
                pontos.add(new Ponto(px, py));
            }

            Ponto up = pontos.get(0);
            Ponto down = pontos.get(0);
            Ponto right = pontos.get(0);
            Ponto left = pontos.get(0);

            for (int i = 1; i < qtd; i++) {
                if (pontos.get(i).y > up.y) {
                    up = pontos.get(i);
                }

                if (pontos.get(i).y < down.y) {
                    down = pontos.get(i);
                }

                if (pontos.get(i).x > right.x) {
                    right = pontos.get(i);
                }

                if (pontos.get(i).x < left.x) {
                    left = pontos.get(i);
                }
            }

            System.out.print("\nO ponto mais acima é: ");
            up.imprime_ponto();
            System.out.print("\nO ponto mais abaixo é: ");
            down.imprime_ponto();
            System.out.print("\nO ponto mais a direita é: ");
            right.imprime_ponto();
            System.out.print("\nO ponto mais a esquerda é: ");
            left.imprime_ponto();
        }
    }
}
