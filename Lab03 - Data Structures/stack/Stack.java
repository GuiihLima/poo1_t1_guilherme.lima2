public class Stack {
    private List list = new List();

    public void push(int x) {
        list.push_front(x);
    }

    public void size() {
        list.size();
    }

    public void pop() {
        list.pop_front();
    }

    public void top () {
        list.front();
    }

    public void print(){
        list.print();
    }
}
