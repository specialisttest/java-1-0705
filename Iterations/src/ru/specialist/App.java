package ru.specialist;

public class App {

	public static void main(String[] args) {
		for(int i=1; i <= 10; i++) {
			if (i == 4) continue;
			if (i == 8) break;
			System.out.println(i);
		}
		
		int a = 10;
		//a += 2; // a = a + 2;
		//a += 1; //a = a + 1;
		//a--; --a;
		//a++; // postfix inc
		//++a; // prefix inc
		
		//int b = a++ + ++a; // bad, в С и С++ UB
		//      10  +  12
		int b = ++a + a++; 
		//      11  + 11
		
		System.out.printf("a = %d\nb = %d\n", a, b); // 12 22
		
		for(int i = 100; i > 0; i -= 3)
			System.out.println(i);
		
		//  1  2  3  4  ... 10
		//  2  4  6  8  ... 20
		//  ....
label:
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= 10; j++) {
				if (j == 5) break label;
				System.out.printf("%-4d", i * j);
			}
			System.out.println();
		}
		// break label прыгнет сюда
		
		System.out.println("main continue");
		
		// infinite
		//for(;;);
		
		// 2 4 8 16 32 < 1000
		int n = 2000;
		while(n < 1000) {
			System.out.println(n);
			n *= 2; // n  = n * 2;
		}
		
		n = 2;
		do {
			System.out.println(n);
		} while ( (n *= 2) < 1000);
		
		
		
		char ch = (char)0x23;
		
		System.out.printf("%c", ch);
		System.out.println();
		
		int[] nums = {100, 200, 300};
		for(int k : nums) // while
			System.out.println(k);
		

	}

}
