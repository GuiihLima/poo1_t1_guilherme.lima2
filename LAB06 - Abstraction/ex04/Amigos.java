package ex04;

public class Amigos extends Contatos {
    private int grau; // 1=Melhor amigo 2=Amigo 3=Conhecido

    public Amigos(String apelido, String nome, String email, String aniversario, int grau) {
        super(apelido, nome, email, aniversario);
        this.grau = grau;
    }

    public String imprimirContato() {
        String str = "\nContato Amigos:" + super.imprimirBasico();
        switch(grau){
            case 1: 
                str += "\nGrau:\tMelhor Amigo";
                break;
            
            case 2:
                str += "\nGrau:\tAmigo";
                break;

            case 3:
                str += "\nGrau:\tConhecido";
                break;

            default:
                return (String) null;
        }
        return str;
    }
}
