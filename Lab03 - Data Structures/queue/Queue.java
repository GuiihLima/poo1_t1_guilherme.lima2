public class Queue {
    private List list = new List();

    public void push(int x) {
        list.push_back(x);
    }

    public void size() {
        list.size();
    }

    public void pop() {
        list.pop_front();
    }

    public void front() {
        list.front();
    }

    public void print() {
        list.print();
    }
}
