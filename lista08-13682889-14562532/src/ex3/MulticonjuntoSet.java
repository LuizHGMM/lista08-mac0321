package ex3;

import java.util.HashSet;
import java.util.Set;



public class MulticonjuntoSet<T> {
	
	
	
    private Set<T> setMult;

    public MulticonjuntoSet() {
        this.setMult = new HashSet<>();
    }

    public void add(T novoElemento) {
        setMult.add(novoElemento);
    }

    public boolean equals(MulticonjuntoSet<T> m) {
    	
    	Set<T> otherSetMult = m.getSetMult();
        return this.setMult.equals(otherSetMult);
    }

    public void addAll(MulticonjuntoSet<T> m) {
        this.setMult.addAll(m.getSetMult());
    }
	
    public Set<T> getSetMult() {
		return setMult;
	}
}
