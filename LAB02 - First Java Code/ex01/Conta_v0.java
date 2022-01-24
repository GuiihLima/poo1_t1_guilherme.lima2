public class Conta_v0 {
    String nome = "Guilherme";
    String profissao = "Analista de Dados";
    int idade = 19;
    double saldo = 15300.50;
    protected String nome(){
        return nome;
    }
    protected String profissao(){
        return profissao;
    }
    protected int idade(){
        return idade;
    }
    protected double saldo(){
        return saldo;
    }
    protected void saldoDecrease(double n){
        saldo = saldo - n;
    }
    protected void saldoIncrease(double n){
        saldo = saldo + n;
    }
}
