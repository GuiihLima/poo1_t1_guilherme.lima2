package ex04;

public class Colegas_Trab extends Contato {
    private String tipo;

    public Colegas_Trab(String apelido, String nome, String email, String aniversario, String tipo) {
        super(apelido, nome, email, aniversario);
        this.tipo = tipo;
    }

    public String imprimirContato() {
        return "\nContato Trabalho:" + super.imprimirBasico() + "\nTipo:\t" + tipo;
    }
}