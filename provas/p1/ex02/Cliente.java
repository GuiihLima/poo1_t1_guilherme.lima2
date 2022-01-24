public class Banco{

}

public class Cliente {
    protected int id;
    protected String nome;
    protected String cpf;
    protected String nascimento;
    protected String endereço;
    protected String cidade;
    protected String estado;
    protected boolean conta_corrente;
    protected String gerente;
    
    public void callGerente(){
        Banco chamado = new Banco();
        chamado.gerente(gerente);
    }
}
