package ex02;

public class Horista extends Funcionario{
    public Horista(String nome, String data_nascimento){
        super(nome, data_nascimento, 0);
    }

    public void insert_trabalho(int horas_trabalhadas){
        super.salario = 20 * horas_trabalhadas;
    }
}
