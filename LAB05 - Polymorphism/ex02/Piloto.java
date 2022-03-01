package ex02;

public class Piloto extends Funcionario {
    private int numeroHoras;

    public Piloto(String nome, String CPF, String RG, int idade, int matricula, int numeroHoras) {
        super(nome, CPF, RG, idade, matricula);
        this.numeroHoras = numeroHoras;
    }

    public float calculaSalario() {
        return salarioBase + numeroHoras * 4;
    }
}
