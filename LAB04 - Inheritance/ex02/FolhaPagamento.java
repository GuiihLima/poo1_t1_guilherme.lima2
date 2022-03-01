package ex02;

public class FolhaPagamento extends Funcionario{
    public static float folha_pagamento(Funcionario[] f){
        System.out.println("\tFolha de Pagamento\n");
        float pagamento = 0;
        for(int i = 0; i < f.length; i++){
            System.out.println(i+1 + ") Funcionario:\t" + f[i].getNome());
            System.out.println("   Salario:\t" + f[i].getSalario());
            System.out.println();
            pagamento += f[i].getSalario();
        }
        return pagamento;
    }
}