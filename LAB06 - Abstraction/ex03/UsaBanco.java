package ex03;

import ex02.*;

public class UsaBanco {
    public static void main(String[] args) {
        ContaEspecial conta_corrente = new ContaEspecial(1500, 834762, 1234, 3000);

        float mesa = 150;
        conta_corrente.debitaValor(mesa, 1234);

        float cadeira_gamer = 570;
        conta_corrente.debitaValor(cadeira_gamer, 1234);

        System.out.println(conta_corrente.getSaldo(1234));
        System.out.println(conta_corrente.getLimite(1234));

        conta_corrente.creditaValor(1234, 1200);
        System.out.println(conta_corrente.getSaldo(1234));
    }
}