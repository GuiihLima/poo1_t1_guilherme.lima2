package ex03;

public class CD extends Item {
    private String artista;

    public CD(String titulo, int duracao, String comentarios, String artista) {
        super(titulo, duracao, comentarios);
        this.artista = artista;
    }

    public void print() {
        super.print();
        System.out.println("Artista: " + artista);
    }
}
