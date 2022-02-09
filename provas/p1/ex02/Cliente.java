public class Banco{

}

public class Cliente {
    protected int id;
    protected String nome;
    protected String cpf;
    protected String nascimento;
    protected String endereco;
    protected String cidade;
    protected String estado;
    protected boolean conta_corrente = false;
    protected String gerente;
    
    public void callGerente(){
        Banco chamado = new Banco();// check:??
        chamado.gerente(gerente);
    }

    public void alternarContaCorrente(){
        conta_corrente = !conta_corrente;
    }

    public void cadastroCliente(int ID, String name, String CPF, String birth, String address, String city, String state, String manager){
        id = ID;
        nome = name;
        cpf = CPF;
        nascimento = birth;
        endereco = address;
        cidade = city;
        estado = state;
        gerente = manager;
    }
}
