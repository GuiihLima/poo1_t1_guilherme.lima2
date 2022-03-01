package ex02;

public class Atendente extends Funcionario {
    private float comissao;
    private int numeroVendas;

    public Atendente(String nome, String CPF, String RG, int idade, int matricula) {
        super(nome, CPF, RG, idade, matricula);
        this.comissao = 0.45f;
        this.numeroVendas = 0;
    }

    public void computaVenda() {
        this.numeroVendas++;
    }

    public float calculaSalario() {
        return salarioBase + numeroVendas * comissao;
    }
}
