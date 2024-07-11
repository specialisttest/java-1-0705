package ru.specialist;

public class NodeInt {
	
	public int value;
	
	public NodeInt next;
	
	public NodeInt(int value) {
		this(value, null);
	}
	
	
	public NodeInt(int value, NodeInt next) {
		this.value = value;
		this.next = next;
	}

}
