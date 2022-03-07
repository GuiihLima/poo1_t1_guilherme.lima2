package ex04;

public class Trabalho extends Contatos {
    private String tipo;

    public Trabalho(String apelido, String nome, String email, String aniversario, String tipo) {
        super(apelido, nome, email, aniversario);
        this.tipo = tipo;
    }

    public String imprimirContato() {
        return "\nContato Trabalho:" + super.imprimirBasico() + "\nTipo:\t" + tipo;
    }
}
