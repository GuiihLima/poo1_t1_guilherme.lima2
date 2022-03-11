package ex01;

import java.util.Scanner;

public class Prog {
    public static void main(String[] args) {
        Cliente[] clientes = new Cliente[3];
        Produto[] produtos = new Produto[3];
        Serviço[] serviços = new Serviço[3];

        try (Scanner scan = new Scanner(System.in)) {
            for (int i = 0; i < 3; i++) {
                System.out.print("\n" + (i + 1) + ") Cliente: ");
                clientes[i] = new Cliente(scan.next());
                System.out.print("\n" + (i + 1) + ") Produto: ");
                produtos[i] = new Produto(scan.nextInt());
                System.out.print("\n" + (i + 1) + ") Serviço: ");
                serviços[i] = new Serviço(scan.nextFloat());
            }
        }

        Classificador ordenador = new Classificador();
        ordenador.ordena(clientes);
        ordenador.ordena(produtos);
        ordenador.ordena(serviços);

        System.out.println("\nObjetos ordenados ==>");
        for (int i = 0; i < 3; i++){
            System.out.print("\n" + (i + 1) + ") Cliente: " + clientes[i].getNome());
            System.out.print("\n" + (i + 1) + ") Produto: " + produtos[i].getCodigo());
            System.out.print("\n" + (i + 1) + ") Serviço: " + serviços[i].getPreço());
        }
    }
}
