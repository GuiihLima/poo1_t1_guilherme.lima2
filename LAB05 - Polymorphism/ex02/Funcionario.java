package ex02;

public class Funcionario extends Pessoa {
    protected int matricula;
    protected float salarioBase;

    public Funcionario(String nome, String CPF, String RG, int idade, int matricula) {
        super(nome, CPF, RG, idade);
        this.matricula = matricula;
        this.salarioBase = 1000;
    }

    public float calculaSalario() {
        return salarioBase;
    }
}
