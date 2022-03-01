package ex03;

public class Item {
    private String titulo;
    private int duracao;
    private String comentarios;

    public Item(String titulo, int duracao, String comentarios) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.comentarios = comentarios;
    }

    public void print() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Duracao: " + duracao);
        System.out.println("Comentarios" + comentarios);
    }
}
