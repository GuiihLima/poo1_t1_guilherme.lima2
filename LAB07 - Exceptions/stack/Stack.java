package stack;

import list.List;

public class Stack {
    private List list = new List();

    public void push(int x) {
        list.push_front(x);
    }

    public void size() {
        list.size();
    }

    public void pop() throws IllegalStateException {
        list.pop_front();
    }

    public void top() throws IllegalStateException {
        list.front();
    }

    public void print() throws IllegalStateException {
        list.print();
    }
}
