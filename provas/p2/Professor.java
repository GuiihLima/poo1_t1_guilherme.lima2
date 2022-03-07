package p2;

import java.util.Date;

public class Professor extends Pessoa {
    String NumeroFuncional;
    Date DataContrato;

    public Professor(String nome, String cpf, String numeroFuncional, Date dataContrato) {
        super(nome, cpf);
        NumeroFuncional = numeroFuncional;
        DataContrato = dataContrato;
    }

    public Professor(String nome, String cpf, String numeroFuncional) {
        super(nome, cpf);
        NumeroFuncional = numeroFuncional;
    }

    public String gerarCertificado() {
        return "Certifico que o " + super.nome + " é orientador de estudantes";
    }

    public boolean ehSenior(Senioridade obj) {
        if (this.DataContrato.compareTo(((Professor) obj).getDataContrato()) < 0)
            return true;
        else
            return false;
    }

    public Date getDataContrato() {
        return DataContrato;
    }
}
