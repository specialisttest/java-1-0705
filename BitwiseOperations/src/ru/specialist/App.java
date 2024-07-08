package ru.specialist;

public class App {

	public static void main(String[] args) {
		int a = 5; // 0101
		int b = 7; // 0111
		
		// Битовое И
		int c = a & b; // 0101
		
		// Битовое ИЛИ
		c = a | b; // 0111
		
		// Битовое НЕ
		c = ~a; //  1010   -a-1
		
		// Битовое ИСКЛЮЧАЮЩЕЕ ИЛИ (XOR)
		c = a ^ b; // 0010
		
		// битовый сдвиг вправо
		c = a >> 2; // 0101 >> 2 == 0001
		
		// битовый сдвиг влево
		c = a << 2; // 0101 << 2 == 010100
		
		c = (b >> 1) & 1;
		
		System.out.println( c );

	}

}
