package ex01;

public class Cliente implements Classificavel {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public boolean eMenorQue(Classificavel cliente) {
        Cliente compara = (Cliente) cliente;
        if (this.nome.charAt(0) < compara.nome.charAt(0)) {
            return true;
        } else {
            return false;
        }
    }

    public String getNome() {
        return this.nome;
    }
}
