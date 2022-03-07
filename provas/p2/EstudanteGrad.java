package p2;

public class EstudanteGrad extends Universitarios {
    int CargaHorariaComplementar;
    String TituloTCC;
    String LocalEstagio;

    public EstudanteGrad(String nome, String cpf, String matricula) {
        super(nome, cpf, matricula);
    }

    public void setCargaHorariaDisciplinas(int cargaHorariaDisciplinas) {
        if (cargaHorariaDisciplinas > 0 && cargaHorariaDisciplinas <= 3000)
            super.cargaHorariaDisciplinas = cargaHorariaDisciplinas;

        else
            throw new InvalidNumException();
    }

    public int getCargaHorariaComplementar() {
        return CargaHorariaComplementar;
    }

    public void setCargaHorariaComplementar(int cargaHorariaComplementar) {
        if (cargaHorariaComplementar > 0 && cargaHorariaComplementar <= 3000)
            CargaHorariaComplementar = cargaHorariaComplementar;

        else
            throw new InvalidNumException();
    }

    public String getTituloTCC() {
        return TituloTCC;
    }

    public void setTituloTCC(String tituloTCC) {
        TituloTCC = tituloTCC;
    }

    public String getLocalEstagio() {
        return LocalEstagio;
    }

    public void setLocalEstagio(String localEstagio) {
        LocalEstagio = localEstagio;
    }

    public String gerarCertificado() {
        return "Certifico que o " + super.nome + " realiza estágio em " + LocalEstagio;
    }

    public void informacoesUniversitario() {
        System.out.println("Nome: " + super.nome);
        System.out.println("CPF: " + super.cpf);
        System.out.println("Matricula: " + super.matricula);
        System.out.println("Carga Horária: " + super.cargaHorariaDisciplinas);
        System.out.println("Horas complementares: " + CargaHorariaComplementar);
        System.out.println("Local do estágio: " + CargaHorariaComplementar);
        System.out.println("Título do TCC: " + TituloTCC);
    }

    public boolean ehSenior(Senioridade obj) {
        int cargaHorariaTotal = super.getCargaHorariaDisciplinas() + CargaHorariaComplementar;
        if (cargaHorariaTotal > ((Universitarios) obj).getCargaHorariaDisciplinas()
                + ((EstudanteGrad) obj).getCargaHorariaComplementar())
            return true;

        else
            return false;
    }
}
