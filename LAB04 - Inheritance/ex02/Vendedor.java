package ex02;

public class Vendedor extends Funcionario{
    public Vendedor(String nome, String data_nascimento){
        super(nome, data_nascimento, 2000);
    }
    
    public void insert_vendas(int vendas){
        super.salario += 50 * vendas;
    }
}
