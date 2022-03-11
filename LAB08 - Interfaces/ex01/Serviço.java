package ex01;

public class Serviço implements Classificavel {
    private float preço;

    public Serviço(float preço) {
        this.preço = preço;
    }

    public boolean eMenorQue(Classificavel serviço) {
        Serviço compara = (Serviço) serviço;
        if (this.preço < compara.preço) {
            return true;
        } else {
            return false;
        }
    }

    public float getPreço() {
        return this.preço;
    }
}
