package ru.specialist;

import java.util.Scanner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class App {

	public static void main(String[] args) //throws IOException 
	{
		System.out.print("Введите ваше имя: ");
		try (Scanner sc = new Scanner(System.in)) {
			String userName = sc.nextLine();
			System.out.print("Введите ваш возраст: ");
			int age = sc.nextInt(); // nextDouble()
		
		/*System.out.print("Введите ваше имя: ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String userName = reader.readLine();
		
		System.out.print("Введите ваш возраст: ");
		
		final int age = Integer.parseInt(reader.readLine());*/
		//Double.parseDouble("")
		
		
			// Привет, Сергей - 46!
			System.out.printf("Привет, %s - %d!\n", userName, age);
		
		} //sc.close();
		
		// e, f, g
		double dd = 2.5;
		// Переменная dd = 2.5
		System.out.printf("Переменная dd = %6.1f\n", dd);
		


	}

}
