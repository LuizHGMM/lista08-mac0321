package ex3;

import java.util.LinkedList;
import java.util.List;

public class MulticonjuntoLinkedList<T> {
    private List<T> lista;

    public MulticonjuntoLinkedList() {
        this.lista = new LinkedList<>();
    }

    public void add(T element) {
        lista.add(element);
    }

    public boolean equals(MulticonjuntoLinkedList<T> m) {
        return this.lista.equals(m.lista);
    }

    public void addAll(MulticonjuntoLinkedList<T> m) {
        this.lista.addAll(m.lista);
    }
}
