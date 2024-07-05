package ru.specialist;

class Борщ {}

/**
 * Main application class
 * @author Specialist
 * @since Java 1
 * 
 */
class App {
	
	static int q;

	/**
	 * Program entry point
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		
		// Переменная - variable
		
		// Декларация переменной
		int x;  // ValueType
		double f = 2.5;
		/*
		 * Тип		Размер в памяти		Диапазон
		 * byte			1				-128   .. 127
		 * short		2				-32768 .. 32767
		 * int			4				-2^31  .. 2^31 - 1
		 * long			8				-2^63  .. 2^63-1
		 * 
		 * float		4
		 * double		8
		 * 
		 * boolean		1				false true
		 * 
		 * char			2				UTF-16
		 * 
		 */
		
		
		// Присваивания значения
		x = 30 + 5;
		
		System.out.println( x );
		
		x = 25;
		
		int y;
		
		y = x + 5;
		
		System.out.println( x /*получение текущего значения перемнной*/);
		System.out.println( y );
		
		int a = 53, b = 7;
		int z = 10;
		
		
		System.out.println(q);
 		
		
		// строчный комментарий
		String s = "Hello, world"; // Reference Type
		/*
		 * class
		 * interface
		 * @interface (annotation)
		 * array
		 * enum
		 * 
		 * 
		 * 
		 * 
		 */
		
		System.out.println( s );
		
		// byte, short int, long
		int i = 10 / 5  + 2 - 3 * 2 + 7 % 3;
		//         1    4   5   2   6   3
		i = 1 + 2 * 3; // 7
		i = (1 + 2) * 3; // 9
		
		byte b1 = 120;
		int l = i * b1;
		System.out.println( l ); // 1080
		
		i = b1; // implicit conversion (no errors)
	// int=byte 
		i = 255;
		
		// Оператор cast
		b1 = (byte)i; // explicit conversion (possible errors)
		
		System.out.println( i );
		System.out.println( b1 );
		
		int k = 7 / 3;
		
		k = 0x1F;   // 16-ричная
		k = 040;	// 8-ричная
		k = 0b0111; // двоичная
		System.out.println( k );
		
		k = Integer.MAX_VALUE;
		System.out.println( k );
		
		long p = k + 1L;
		System.out.println( p );
		
		
		// camel notation
		// variables, methods, paramters, field class
		int userCounter;
		userCounter = 10;
		
		String name;
		
		String $name1;
		
		// UTF-8
		Борщ борщ = new Борщ();
		
		
		// Pascal notation
		// class, interface, enum (user-defined types)
		// class MyClass
		
		// packages, modules
		// java.lang, ru.specialist.hello, java.base
		
		// Константы
		// Math.PI
		// DEFAULT_COLOR = "black";
		
		double d1 = 2.5;
		double d2 = 2e7; // 20000000
		double d3 = 2d;
		
		float f1 = 2.5F;
		
		// + - * /
		
		int v = 5;
		double n = v / 2d;
		
		System.out.println( n );
		
		char ch = '\u002F'; // utf-16
		int chCode = (int)ch;
		
		ch = (char)65;
		
		System.out.print( chCode );
		System.out.println( ch );
		
		String userName = "Сергей";
		int age = 46;
		// Привет, Сергей - 46!
		System.out.printf("Привет, %-20s - %x!\n", userName, age);
		// e, f, g
		double dd = 2.5;
		// Переменная dd = 2.5
		System.out.printf("Переменная dd = %6.1f\n", dd);
		
		
		/*
			// строчный комментарий
			блочный комментарий
		*/
	}

}
