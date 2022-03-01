package ex03;

public class CamaroteSuperior extends VIP{
    private String local = "Camarote Superior";

    public String getlocal(){
        return local;
    }

    public void printLocal(){
        System.out.println("Localização: " + local);
    }

    public float getValor(){
        return super.getValor() + 10;
    }
}
