public class Prog {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        List lista = new List();
        lista.insert_sorted(42);
        lista.insert_sorted(10);
        lista.insert_sorted(2);
        System.out.println("Tamanho da lista: " + lista.size());
        System.out.println("Lista: ");
        lista.print();
    }
}