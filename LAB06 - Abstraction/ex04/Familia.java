package ex04;

public class Familia extends Contatos {
    private String parentesco;

    public Familia(String apelido, String nome, String email, String aniversario, String parentesco) {
        super(apelido, nome, email, aniversario);
        this.parentesco = parentesco;
    }

    public String imprimirContato() {
        return "\nContato Familia" + super.imprimirBasico() + "\nParentesco:\t" + parentesco;
    }
}