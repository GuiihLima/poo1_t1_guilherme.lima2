package queue;

import list.List;

public class Queue {
    private List list = new List();

    public void push(int x) {
        list.push_back(x);
    }

    public void size() {
        list.size();
    }

    public void pop() throws IllegalStateException {
        list.pop_front();
    }

    public void front() throws IllegalStateException {
        list.front();
    }

    public void print() throws IllegalStateException {
        list.print();
    }
}
