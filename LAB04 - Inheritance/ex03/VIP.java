package ex03;

public class VIP extends Ingresso{
    private float valor = super.valor + 20;

    public float getValor(){
        return this.valor;
    }
}
