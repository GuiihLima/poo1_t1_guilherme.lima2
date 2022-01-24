public class Banco_v0 {
    Conta_v0 cliente = new Conta_v0();
    public Conta_v0 mostrarUsuario(){
        return cliente;
    }
    public void gastou(double n){
        cliente.saldoDecrease(n);
        System.out.println("Gastou " + n + " !!");
    }
    public void recebeu(double n){
        cliente.saldoIncrease(n);
        System.out.println("Recebeu " + n + " !!");
    }

    public static void main(String[] args) {
        Banco_v0 dados = new Banco_v0();
        String nome = dados.cliente.nome();
        System.out.println("Nome: " + nome);
        int idade = dados.cliente.idade();
        System.out.println("Idade: " + idade);
        String profissao = dados.cliente.profissao();
        System.out.println("Profissao: " + profissao);
        double saldo = dados.cliente.saldo();
        System.out.println("Saldo atual: " + saldo);
        dados.gastou(5300.0);
        saldo = dados.cliente.saldo();
        System.out.println("Saldo atual: " + saldo);
    }
}
