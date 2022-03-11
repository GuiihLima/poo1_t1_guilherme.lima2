package ex04;

import java.util.ArrayList;
import java.util.Scanner;

public class FaceFriends {
    ArrayList<Contatos> contato = new ArrayList<Contatos>();

    public static void setContato() {
        while (true) {
            int option;

            System.out.println("|=====================================|");
            System.out.println("|          Adicionar Contato          |");
            System.out.println("|                                     |");
            System.out.println("| 0 - Sair                            |");
            System.out.println("|                                     |");
            System.out.println("| 1 - Contato de amigos               |");
            System.out.println("|                                     |");
            System.out.println("| 2 - Contato de familia              |");
            System.out.println("|                                     |");
            System.out.println("| 3 - Contato de trabalho             |");
            System.out.println("|=====================================|\n");

            Scanner scan = new Scanner(System.in);
            System.out.print("Digite a opção desejada: ");
            option = scan.nextInt();
            System.out.println();

            switch (option) {
                case 0:
                    return;

                default:
                    System.out.println("\nOpção inválida\n");
                    break;
            }
        }
    }

    public static void menu() {
        while (true) {
            int option;

            System.out.println("|=====================================|");
            System.out.println("|       Gerenciador de Contatos       |");
            System.out.println("|                                     |");
            System.out.println("| 0 - Sair                            |");
            System.out.println("|                                     |");
            System.out.println("| 1 - Inserir novo contato            |");
            System.out.println("|                                     |");
            System.out.println("| 2 - Imprimir todos os contatos      |");
            System.out.println("|                                     |");
            System.out.println("| 3 - Imprimir contatos amigos        |");
            System.out.println("|                                     |");
            System.out.println("| 4 - Imprimir contatos familia       |");
            System.out.println("|                                     |");
            System.out.println("| 5 - Imprimir contatos trabalho      |");
            System.out.println("|                                     |");
            System.out.println("| 6 - Imprimir \"Irmãos\"               |");
            System.out.println("|                                     |");
            System.out.println("| 7 - Imprimir \"Melhores Amigos\"      |");
            System.out.println("|                                     |");
            System.out.println("| 8 - Imprimir \"Colegas de Trabalho\"  |");
            System.out.println("|=====================================|\n");

            Scanner scan = new Scanner(System.in);
            System.out.print("Digite a opção desejada: ");
            option = scan.nextInt();
            System.out.println();

            switch (option) {
                case 0:
                    return;

                case 1:
                    setContato();
                    break;

                default:
                    System.out.println("Opção inválida\n");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        // Incompleto
        menu();
    }
}
