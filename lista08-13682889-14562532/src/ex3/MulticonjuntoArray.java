package ex3;
import java.util.ArrayList;
import java.util.List;

public class MulticonjuntoArray<T>  {
    private List<T> array;
    
    

    public MulticonjuntoArray() {
    	
    	
        this.array = new ArrayList<>();
    }

    public void add(T element) {
        array.add(element);
    }

    public boolean equals(MulticonjuntoArray<T> m) {
        return this.array.equals(m.array);
    }

    public void addAll(MulticonjuntoArray<T> m) {
        this.array.addAll(m.array);
    }
}