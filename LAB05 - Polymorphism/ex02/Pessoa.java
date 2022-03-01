package ex02;

public class Pessoa {
    protected String nome, CPF, RG;
    protected int idade;

    public Pessoa(String nome, String CPF, String RG, int idade) {
        this.nome = nome;
        this.CPF = CPF;
        this.RG = RG;
        this.idade = idade;
    }
}