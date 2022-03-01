package ex02;

public class Funcionario{
    protected String nome;
    protected String data_nascimento;
    protected float salario;

    public Funcionario(){
        this.nome = "Indefinido";
        this.data_nascimento = "Indefinido";
        this.salario = 0;
    }

    public Funcionario(String nome, String data_nascimento, float salario){
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.salario = salario;
    }

    public String getNome(){
        return this.nome;
    }

    public String getDataNascimento(){
        return this.data_nascimento;
    }

    public float getSalario(){
        return this.salario;
    }
}