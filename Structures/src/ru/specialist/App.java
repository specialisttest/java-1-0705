package ru.specialist;

public class App {

	public static void main(String[] args) {
		ListInt list = new ListInt();
		
		list.add(15).add(6).add(13).add(99).add(1);

		list.print();
		
		list.remove(15);
		
		list.print();
		
		System.out.println( list.contains(13));
		System.out.println( list.indexOf(1));
		System.out.println( list.get(1));
		
	}

}
