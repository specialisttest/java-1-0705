package ru.specialist;

import java.util.Scanner;
import java.util.Random;

public class App
{

	public static final int MAX_ATTEMPTS = 7;
	
	public static void main(String[] args)
	{

		int q = new Random().nextInt(100)+1; // [1..100]
		System.out.println(q);
		
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int counter = 0;
		do
		{
			System.out.print("Угадай число [1..100]: ");
			x = sc.nextInt();
			if (x == 0) break;
			if (x > q)
				System.out.println("Много");
			if (x < q)
				System.out.println("Мало");
		}
		while(++counter < MAX_ATTEMPTS && x != q);
		
		if (x == q)
			System.out.printf("Вы выиграли. Число попыток: %d\n", counter);
		else
			System.out.println("Вы проиграли");
		
	}

}
