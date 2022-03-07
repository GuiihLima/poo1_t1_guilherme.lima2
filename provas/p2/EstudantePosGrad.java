package p2;

public class EstudantePosGrad extends Universitarios {
    String Nivel; // doutorado ou mestrado
    String TemaProjetoPesquisa;

    public EstudantePosGrad(String nome, String cpf, String matricula) {
        super(nome, cpf, matricula);
    }

    public String getNivel() {
        return Nivel;
    }

    public void setNivel(String nivel) {
        Nivel = nivel;
    }

    public String getTemaProjetoPesquisa() {
        return TemaProjetoPesquisa;
    }

    public void setTemaProjetoPesquisa(String temaProjetoPesquisa) {
        TemaProjetoPesquisa = temaProjetoPesquisa;
    }

    public String gerarCertificado() {
        return "Certifico que o " + super.nome + " participa do projeto " + TemaProjetoPesquisa;
    }

    public void informacoesUniversitario() {
        System.out.println("Nome: " + super.nome);
        System.out.println("CPF: " + super.cpf);
        System.out.println("Matricula: " + super.matricula);
        System.out.println("Carga Horária: " + super.cargaHorariaDisciplinas);
        System.out.println("Nível: " + Nivel);
        System.out.println("Tema de pesquisa: " + TemaProjetoPesquisa);
    }

    public boolean ehSenior(Senioridade obj) {
        if (this.Nivel == "doutorado" && ((EstudantePosGrad) obj).getNivel() != "doutorado")
            return true;

        else
            return false;
    }
}
