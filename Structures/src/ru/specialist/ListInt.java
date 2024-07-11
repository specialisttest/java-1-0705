package ru.specialist;

public class ListInt {
	
	public NodeInt first = null;
	public int size = 0;
	
	public ListInt add(int value) {
		NodeInt newNode = new NodeInt(value);
		if (size == 0)
			this.first = newNode;
		else {
			var last = first;
			while(last != null && last.next != null)
				last = last.next;
			
			if (last != null)
				last.next = newNode;
		}
		size++;
		return this;
	}
	
	public boolean remove(int value) {
		if (first != null && first.value == value) {
			first = first.next;
			size--;
			return true;
		}
			
		var prev = first;
		while(prev != null && prev.next.value != value)
			prev = prev.next;
		
		if (prev != null) {
			prev.next = prev.next.next;
			size--;
			return true;
		}
		return false;
	}
	
	public void print() {
		System.out.printf("List size: %d Values: ", size);
		var next = first;
		while(next != null) {
			System.out.printf("%-4d", next.value);
			next = next.next;
		}
		System.out.println();
	}
	

}
