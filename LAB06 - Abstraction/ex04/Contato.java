package ex04;

public abstract class Contato {
    private String apelido;
    private String nome;
    private String email;
    private String aniversario;

    public Contato(String apelido, String nome, String email, String aniversario) {
        this.apelido = apelido;
        this.nome = nome;
        this.email = email;
        this.aniversario = aniversario;
    }

    public String imprimirBasico() {
        return "\nApelido:\t" + apelido + "\nNome:\t" + nome + "\nEmail:\t" + email + "\nAniversário:\t" + aniversario;
    }

    protected abstract String imprimirContato();
}