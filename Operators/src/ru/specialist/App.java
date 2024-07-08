package ru.specialist;

public class App {

	public static void main(String[] args) {
		int n = -10;
		
		if (n > 0) {
			System.out.println("n больше 0");
			System.out.println("n > 0");		
		}
		else
			if (n > -100)
				System.out.println("n больше -100, но не больше 0");
			else
				System.out.println("n НЕ больше 0");
		
		int a = 0;
		/*String s;
		if (a == 0)
			s = "ноль";
		else
			s = "не ноль";*/
		
		String s = (a == 0) ? "ноль" : "не ноль";
		
		System.out.println(s);
		
		String userName = "Сергей";
		// userName.isEmpty() проверка на пустоту
		
		System.out.println( (userName != null) ? userName.toUpperCase() : "<пусто>"); 
			
		int k = -1;
		
		// Классический switch
		switch( k ) {
			//case -1:
			case -1, 1:
				System.out.println("один");
				break;
			case 1+1:
				System.out.println("два");
				break;
			case 3:
				System.out.println("три");
				break;
			default:
				System.out.println("много");
				
		}
		
		k = 2;
		// Switch expresssion (Java 12)
		String result = switch( k ) {
			case -1, 1	-> "один";
			case 2		-> "два";
			case 3		-> "три";
			default		-> "много";
		};
		
		System.out.println(result);
		
			
		

	}

}
