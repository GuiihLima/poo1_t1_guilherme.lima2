public class Prog {
    public static void main(String[] args) {
        List lista = new List();
        lista.insert_sorted(42);
        lista.insert_sorted(5);
        lista.insert_sorted(10);
        lista.insert_sorted(64);
        lista.insert_sorted(3);
        System.out.println("Find Data: " + lista.find_data(10));
        System.out.println("Tamanho da lista: " + lista.size());
        System.out.println("Lista: ");
        lista.print();
    }
}