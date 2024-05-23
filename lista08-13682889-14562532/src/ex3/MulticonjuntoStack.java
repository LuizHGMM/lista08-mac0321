package ex3;

import java.util.Stack;

public class MulticonjuntoStack<T> {
    private Stack<T> elements;

    public MulticonjuntoStack() {
        this.elements = new Stack<>();
    }

    public void add(T element) {
        elements.push(element);
    }

    public boolean equals(MulticonjuntoStack<T> m) {
        return this.elements.equals(m.elements);
    }

    public void addAll(MulticonjuntoStack<T> m) {
        this.elements.addAll(m.elements);
    }
}