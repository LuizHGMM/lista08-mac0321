package ex3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteEstruturas {
	
	
//	teste array de multiconjuntos
	@Test
	void testeMulticonjuntoArrayAdd() {
		MulticonjuntoArray<Integer> MultArray = new MulticonjuntoArray<Integer>(); 
		
		MultArray.add(2);
		MultArray.add(2);
		MultArray.add(2);
		
		System.out.println(MultArray);


		
	}
	@Test
	void testeMulticonjuntoArrayEquals() {
		MulticonjuntoArray<Integer> MultArray1 = new MulticonjuntoArray<Integer>(); 
		MulticonjuntoArray<Integer> MultArray2 = new MulticonjuntoArray<Integer>();
		
		MultArray1.add(2);
		MultArray2.add(2);
		
		assertEquals( true, MultArray1.equals(MultArray2));


		
	}
	@Test
	void testeMulticonjuntoLinkedListAdd() {
		MulticonjuntoLinkedList<Integer> MultArray = new MulticonjuntoLinkedList<Integer>(); 
		
		MultArray.add(2);
		MultArray.add(2);
		MultArray.add(2);
		
		System.out.println(MultArray);


		
	}
	
	@Test
	void testeMulticonjuntoLinkedListEquals() {
		
		MulticonjuntoLinkedList<Integer> list1 = new MulticonjuntoLinkedList<Integer>(); 
		MulticonjuntoLinkedList<Integer> list2 = new MulticonjuntoLinkedList<Integer>();
		
		list1.add(2);
		list2.add(2);
		
		assertEquals( true, list1.equals(list2));


		
	}
	@Test
	void testeMulticonjuntoStackAdd() {
		MulticonjuntoArray<Integer> MultArray = new MulticonjuntoArray<Integer>(); 
		
		MultArray.add(2);
		MultArray.add(2);
		MultArray.add(2);
		
		System.out.println(MultArray);


		
	}
	@Test
	void testeMulticonjuntoStackEquals() {
		
		MulticonjuntoStack<Integer> Stack1 = new MulticonjuntoStack<Integer>(); 
		MulticonjuntoStack<Integer> Stack2 = new MulticonjuntoStack<Integer>();
		
		Stack1.add(2);
		Stack2.add(2);
		
		assertEquals( true, Stack1.equals(Stack2));


		
	}
	@Test
	void testeMulticonjuntoSetAdd() {
		MulticonjuntoStack<Integer> MultArray = new MulticonjuntoStack<Integer>(); 
		
		MultArray.add(2);
		MultArray.add(2);
		MultArray.add(2);
		
		System.out.println(MultArray);


		
	}
	@Test
	void testeMulticonjuntoSetEquals() {
		
		MulticonjuntoSet<Integer> Stack1 = new MulticonjuntoSet<Integer>(); 
		MulticonjuntoSet<Integer> Stack2 = new MulticonjuntoSet<Integer>();
		
		Stack1.add(2);
		Stack2.add(2);
		
		assertEquals( true, Stack1.equals(Stack2));


		
	}
}

