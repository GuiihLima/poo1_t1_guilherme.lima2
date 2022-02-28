public class Funcionario{
    protected String nome;
    protected String data_nascimento;
    protected float salario;

    private void Funcionario(){
        this.nome = "Indefinido";
        this.data_nascimento = "Indefinido";
        this.salario = null;
    }

    private void Funcionario(String nome, String data_nascimento, float salario){
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.salario = salario;
    }
}

public class Chefe extends Funcionario{
    public void Chefe(String nome, String data_nascimento){
        super(nome, data_nascimento, 5000);
    }

    public float salario(){
        return this.salario;
    }
}

public class Vendedor extends Funcionario{
    public void Vendedor(String nome, String data_nascimento){
        super(nome, data_nascimento, 2000);
    }
    
    public void insert_vendas(int vendas){
        super.salario += 50 * vendas;
    }
}

public class Operario extends Funcionario{
    public void Operario(String nome, String data_nascimento){
        super(nome, data_nascimento, null);
    }

    public void insert_produtos(int produtos){
        super.salario = 15 * produtos;
    }
}

public class Horista extends Funcionario{
    public void Horista(String nome, String data_nascimento){
        super(nome, data_nascimento, null)
    }

    public void insert_trabalho(int horas_trabalhadas){
        super.salario = 20 * horas_trabalhadas;
    }
}

public class Empresa{
    public static void main(){
        Funcionario funcionarios[4];
        funcionarios[0] = new Chefe("Murilo", "15/02/1983");
        funcionarios[1] = new Vendedor("Carla", "10/10/1990");
        funcionarios[2] = new Operario("Vitor", "18/09/1986");
        funcionarios[3] = new Horista("Maria", "23/03/1989");
        funcionarios[1].insert_vendas(100);
        funcionarios[2].insert_produtos(130);
        funcionarios[3].insert_trabalho(90);

        System.out.println(funcionarios[0].salario())
    }
}