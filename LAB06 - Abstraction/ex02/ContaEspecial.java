package ex02;

public class ContaEspecial extends ContaCorrente {
    private float limite;

    public ContaEspecial(float val, int num, int pwd, float limite) {
        super.saldo = val;
        super.numConta = num;
        super.senha = pwd;
        super.estado = 1;
        this.limite = limite;
    }

    protected ContaCorrente modificaConta() {
        if (this.limite == 0)
            return new ContaComum(super.saldo, super.numConta, super.senha);

        else
            return (ContaCorrente) null;
    }

    public boolean debitaValor(float val, int pwd) {
        if (pwd != super.senha)
            return false;

        if (super.estado != 1)
            return false;

        if (val <= 0)
            return false;

        if (val <= (super.saldo + this.limite))
            super.saldo -= val;

        else
            return false;

        if (super.saldo < 0) {
            this.limite += super.saldo;
            super.saldo = 0;
        }

        if (this.limite == 0)
            estado = 2;

        return true;
    }

    public void debitaValor(float val) {
        if (super.estado != 1)
            return;

        if (val <= 0)
            return;

        if (val <= (super.saldo + this.limite))
            super.saldo -= val;

        else
            return;

        if (super.saldo < 0) {
            this.limite += super.saldo;
            super.saldo = 0;
        }

        if (this.limite == 0)
            estado = 2;
    }

    public float getLimite(int pwd) {
        if (super.senha == pwd)
            return this.limite;

        else
            return -1;
    }
}