package ru.specialist;

class A {
	int a;
}

public class App {
	
	public static final String DEFAULT_USER_NAME = "Незнакомец";
	public static final int DEFAULT_AGE = 18;
			
	
	public static void sayHello() {		
		sayHello(DEFAULT_USER_NAME);
	}
	public static void sayHello(String userName) {
		//System.out.printf("Привет, %s!\n", userName);
		sayHello(userName, DEFAULT_AGE);
	}
	
	public static void sayHello(String userName, int age) {
		System.out.printf("Привет, %s - %d!\n", userName, age);
		
		//return;
	}

	// Overloading - перегрузка
	
	public static double average(double a, double b) {
		double avg = (a + b) / 2D;
		return avg;
	}
	
	public static double average(int a, int b) {
		double avg = (a + b) / 2D;
		return avg;
	}
	
	public static double average(int a, int b, int c) {
		double avg = (a + b + c) / 3D;
		return avg;
	}
	
	//public static double average(int[] m) {
	public static double average(int... m) {
		int summa = 0;
		for(int elem : m)
			summa += elem;
		
		return (double)summa / m.length;
	}
	
	/*
	 * n! = 1 * 2 * 3 ... (n - 1) * n
	 * 0! = 1
	 * n! = (n-1)! * n
	 * 
	 */
	public static int factorialRecursive(int n) {
		if (n == 0) return 1;
		return factorialRecursive(n-1) * n;
	}
	
	public static int factorialInteration(int n) {
		int r = 1;
		for(int i = 1; i <=n; i++)
			r *= i;
		
		return r;
	}
	
	/**
	 * Compute factorial (with overflow control)
	 * @throws ArithmeticException in case of overflow
	 * @param n
	 * @return factorial of n
	 */
	public static int factorial(int n) {
		int r = 1;
		for(int i = 1; i <=n; i++)
			r = Math.multiplyExact(r, i);
		
		return r;
	}
	
	public static int gcd(int k1, int k2) {
		int k3;
		
		while ( (k3 = k1 % k2) != 0) {
			k1 = k2;
			k2 = k3;
		}
		
		return k2;
	}
	
	public static void test1(int a) {
		a++;
		System.out.printf("test1 a = %d\n", a); // 11
	}
	
	public static void test2(A obj) {
		obj.a++;
		System.out.printf("test2 a = %d\n", obj.a); // 11
	}

	public static void main(String[] args) {
		{
			int a = 10;
			test1(a);
			System.out.printf("main1 a = %d\n", a); // 10
		}
		{
			A obj = new A();
			obj.a = 10;
			test2(obj);
			System.out.printf("main2 a = %d\n", obj.a); // 11
		}		
		
		//App app = new App();
		//app.sayHello();
		//app.sayHello();
		App.sayHello("Sergey", 46);
		sayHello("Сергей", 47);
		sayHello("Владимир");
		sayHello();
		
		double x = average(10, 11) * 3;
		
		System.out.println( x );
		
		System.out.println( average(11, 12) );
		System.out.println( average(11.5, 12.6) );
		System.out.println( average(11, 12, 13) );
		
		System.out.printf("6! = %d\n", factorialRecursive(6) );
		System.out.printf("6! = %d\n", factorialInteration(6) );
		
		try {
			System.out.printf("32! = %d\n", factorial(32) );
		} catch (ArithmeticException ex) {
			System.out.println(ex.getMessage());
		}
		
		System.out.println( average( new int[] {100, 200, 300, 400} ) );
		System.out.println( average( 100, 200, 300, 400, 500 ) );
		System.out.println( average( 100, 200, 300, 400, 500, 600 ) );
		
		System.out.println( gcd(1071, 462) );
		System.out.println( gcd(462, 1071) );
		
	}

}
