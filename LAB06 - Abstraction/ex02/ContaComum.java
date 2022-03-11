package ex02;

public class ContaComum extends ContaCorrente {
    private float limite;

    public ContaComum(float val, int num, int pwd) {
        super.saldo = val;
        super.numConta = num;
        super.senha = pwd;
        super.estado = 1;
        this.limite = 0;
    }

    public boolean debitaValor(float val, int pwd) {
        if (pwd != super.senha)
            return false;

        if (super.estado != 1)
            return false;

        if (val <= 0)
            return false;

        if (val <= super.saldo)
            super.saldo -= val;

        else
            return false;

        if (super.saldo == 0)
            super.estado = 2;

        return true;
    }

    public void debitaValor(float val) {
        if (super.estado != 1)
            return;

        if (val <= 0)
            return;

        if (val <= super.saldo)
            super.saldo -= val;

        if (super.saldo == 0)
            estado = 2;
    }
}