package p2;

public abstract class Pessoa implements Senioridade{
    String nome;
    String cpf;
    boolean vacinado = false;

    public Pessoa(){

    }

    public Pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public void setVacinado(boolean vacinado) {
        this.vacinado = vacinado;
    };

    public abstract String gerarCertificado();
}
