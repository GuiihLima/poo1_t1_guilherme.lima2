package ex02;

public class Empresa {
    public static void main(String[] args){
        Funcionario f[] = {
            new Chefe("Murilo", "15/02/1983"),
            new Vendedor("Carla", "10/10/1990"),
            new Operario("Vitor", "18/09/1986"),
            new Horista("Maria", "23/03/1989")
        };
        ((Vendedor) f[1]).insert_vendas(100);
        ((Operario) f[2]).insert_produtos(130);
        ((Horista) f[3]).insert_trabalho(90);

        FolhaPagamento.folha_pagamento(f);
    }
}
