package ex03;

public class DVD extends Item {
    private String diretor;

    public DVD(String titulo, int duracao, String comentarios, String diretor) {
        super(titulo, duracao, comentarios);
        this.diretor = diretor;
    }

    public void print() {
        super.print();
        System.out.println("Diretor: " + diretor);
    }
}
