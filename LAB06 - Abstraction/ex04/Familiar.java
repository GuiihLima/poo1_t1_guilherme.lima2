package ex04;

public class Familiar extends Contato {
    private String parentesco;

    public Familiar(String apelido, String nome, String email, String aniversario, String parentesco) {
        super(apelido, nome, email, aniversario);
        this.parentesco = parentesco;
    }

    public String imprimirContato() {
        return "\nContato Familia" + super.imprimirBasico() + "\nParentesco:\t" + parentesco;
    }
}