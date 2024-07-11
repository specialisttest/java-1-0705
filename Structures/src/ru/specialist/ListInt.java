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
	
	public boolean contains(int value) {
		var node = first;
		while(node != null) {
			if (node.value == value) return true;
			node = node.next;
		}
		
		return false;
	}
	public int indexOf(int value) {
		var node = first;
		int index = 0;
		while(node != null) {
			if (node.value == value) return index;
			node = node.next;
			index++;
		}
		
		return -1; // not found
	}
	public int get(int index) {
		if (index < 0 || index >= size)
			throw new IndexOutOfBoundsException();
		var node = first;
		while(node != null && index != 0) {
			node = node.next;
			index--;
		}
		
		return node.value;
	}
	

}
