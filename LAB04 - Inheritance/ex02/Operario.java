package ex02;

public class Operario extends Funcionario{
    public Operario(String nome, String data_nascimento){
        super(nome, data_nascimento, 0);
    }

    public void insert_produtos(int produtos){
        super.salario = 15 * produtos;
    }
}
