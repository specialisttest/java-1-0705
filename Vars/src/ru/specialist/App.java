package ru.specialist;

public class App {
	
	static final int Z = 23; // constant
	
	public static final double PI = 3.1415;
	
	public static final int AGE = 46;
	
	public static final String COLOR = "black";

	public static void main(String[] args) {
		int x = 5;
		x = 10;
		x++; // 11
		
		final int Q = Z*2; // constant

		final int y = x*2; // final variable
		//y++;
		//y = 5;
		
		//z = 10;
		final int p = y + 2; // final variable
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(Z);
		System.out.println(Q);
		
		final int A = Q*5; // ?????
		
		// int age = 46;
		var age = 46;
		
		//String name = "Sergey";
		var name = "Sergey";
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
