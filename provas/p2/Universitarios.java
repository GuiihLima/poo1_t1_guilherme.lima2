package p2;

public abstract class Universitarios extends Pessoa {
    String matricula;
    int cargaHorariaDisciplinas;
    boolean vacinado = false;

    public Universitarios() {

    }

    public Universitarios(String nome, String cpf, String matricula) {
        super(nome, cpf);
        this.matricula = matricula;
    }

    public int getCargaHorariaDisciplinas() {
        return cargaHorariaDisciplinas;
    }

    public void setCargaHorariaDisciplinas(int cargaHorariaDisciplinas) {
        this.cargaHorariaDisciplinas = cargaHorariaDisciplinas;
    }

    public abstract void informacoesUniversitario();
}
