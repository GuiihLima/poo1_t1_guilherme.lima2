public class List {
    private Node header = null;
    private int listSize = 0;

    public void push_front(int x) {
        Node node = new Node();
        node.data = x;
        node.nodeNext = header;
        header = node;
        listSize++;
    }

    public void push_back(int x) {
        Node node = new Node();
        Node aux = header;
        while (aux.nodeNext != null) {
            aux = aux.nodeNext;
        }
        aux.nodeNext = node;
        node.data = x;
        listSize++;
    }

    public void insert(int pos, int x) {
        pos--;
        if (pos > 0 && pos <= listSize) {
            Node node = new Node();
            Node aux = header;
            for (int i = 1; i < pos; i++) {
                aux = aux.nodeNext;
            }
            node.data = x;
            node.nodeNext = aux.nodeNext;
            aux.nodeNext = node;
            listSize++;
        } else if (pos == 0) {
            push_front(x);
            listSize++;
        }
    }

    public void insert_sorted(int x) {

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
            Node node = new Node();
            while (aux.nodeNext != null) {
                if(aux.nodeNext.data > x){
                    break;
                }
                aux = aux.nodeNext;
            }
            node.data = x;
            node.nodeNext = aux.nodeNext;
            aux.nodeNext = node;
            listSize++;
        }
    }

    public int size() {
        return listSize;
    }

    public void pop_front() {
        header = header.nodeNext;
    }

    public void pop_back() {
        Node aux = header;
        while (aux.nodeNext.nodeNext != null) {
            aux = aux.nodeNext;
        }
        aux.nodeNext = null;
    }

    public int front() {
        return header.data;
    }

    public int back() {
        Node aux = header;
        while (aux.nodeNext != null) {
            aux = aux.nodeNext;
        }
        return aux.data;
    }

    public void print() {
        Node aux = header;
        while (aux != null) {
            System.out.println(aux.data);
            aux = aux.nodeNext;
        }
    }
}
