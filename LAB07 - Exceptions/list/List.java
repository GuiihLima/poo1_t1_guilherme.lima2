package list;

public class List {
    private Node header = null;
    private int listSize = 0;
    private boolean isSorted = false;

    public void push_front(int x) {
        Node node = new Node(x);
        node.nodeNext = header;
        header = node;
        isSorted = false;
        listSize++;
    }

    public void push_back(int x) {
        Node aux = header;
        while (aux.nodeNext != null) {
            aux = aux.nodeNext;
        }
        Node node = new Node(x);
        aux.nodeNext = node;
        isSorted = false;
        listSize++;
    }

    public void insert(int pos, int x) {
        if (pos == 0 || pos > listSize)
            throw new IndexOutOfBoundsException("Posição inválida");
        pos--;
        if (pos == 0) {
            push_front(x);
            listSize++;
        } else {
            Node aux = header;
            for (int i = 1; i < pos; i++) {
                aux = aux.nodeNext;
            }
            Node node = new Node(x);
            node.nodeNext = aux.nodeNext;
            aux.nodeNext = node;
            isSorted = false;
            listSize++;
        }
    }

    public void insert_sorted(int x) {
        if (!isSorted)
            throw new RuntimeException("Lista previamente desordenada");
        if (header == null) {
            push_front(x);
        } else if (header.nodeNext == null) {
            if (header.data > x) {
                push_front(x);
            } else {
                push_back(x);
            }
        } else {
            Node aux = header;
            Node prev = null;
            while (aux != null) {
                if (aux.data >= x)
                    break;
                prev = aux;
                aux = aux.nodeNext;
            }
            Node node = new Node(x);
            if (prev == null) {
                node.nodeNext = header;
                header = node;
            } else {
                prev.nodeNext = node;
                node.nodeNext = aux;
            }
            listSize++;
        }
        isSorted = true;
    }

    public int size() {
        return listSize;
    }

    public void pop_front() throws IllegalStateException {
        if (header == null)
            throw new IllegalStateException("Não há elementos na lista");
        header = header.nodeNext;
    }

    public void pop_back() throws IllegalStateException {
        if (header == null)
            throw new IllegalStateException("Não há elementos na lista");
        Node aux = header;
        while (aux.nodeNext.nodeNext != null) {
            aux = aux.nodeNext;
        }
        aux.nodeNext = null;
    }

    public void erase_data(int x) {
        boolean found = false;
        Node aux = header;
        Node prev = header;
        if (header.data == x) {
            pop_front();
            aux = aux.nodeNext;
            listSize--;
            found = true;
        } else {
            for (int i = 0; i < listSize; i++) {
                if (aux.data == x) {
                    prev.nodeNext = aux.nodeNext;
                    listSize--;
                    found = true;
                } else {
                    prev = aux;
                    aux = aux.nodeNext;
                }
            }
        }
        if (found == false)
            throw new RuntimeException("Elemento não encontrado");
    }

    public void erase_pos(int pos) {
        if (pos == 0 || pos > listSize)
            throw new IndexOutOfBoundsException("Posição inválida");
        pos--;
        if (pos == 0) {
            pop_front();
            listSize--;
        } else {
            Node aux = header;
            for (int i = 1; i < pos; i++) {
                aux = aux.nodeNext;
            }
            aux.nodeNext = aux.nodeNext.nodeNext;
            listSize--;
        }

    }

    public int find_pos(int pos) {
        if (pos == 0 || pos > listSize)
            throw new IndexOutOfBoundsException("Posição inválida");
        pos--;
        if (pos == 0)
            return header.data;
        else {
            Node aux = header;
            for (int i = 0; i < pos; i++) {
                aux = aux.nodeNext;
            }
            return aux.data;
        }
    }

    public int find_data(int data) {
        Node aux = header;
        for (int i = 0; i < listSize; i++) {
            if (aux.data == data)
                return i + 1;
            else
                aux = aux.nodeNext;
        }
        throw new RuntimeException("Elemento não encontrado");
    }

    public int front() throws IllegalStateException {
        if (header == null)
            throw new IllegalStateException("Não há elementos na lista");
        return header.data;
    }

    public int back() throws IllegalStateException {
        if (header == null)
            throw new IllegalStateException("Não há elementos na lista");
        Node aux = header;
        while (aux.nodeNext != null) {
            aux = aux.nodeNext;
        }
        return aux.data;
    }

    public int get_pos(int pos) {
        return find_pos(pos);
    }

    public void print() throws IllegalStateException {
        if (header == null)
            throw new IllegalStateException("Não há elementos na lista");
        Node aux = header;
        for (int i = 0; i < listSize; i++) {
            System.out.println(aux.data);
            aux = aux.nodeNext;
        }
    }
}
