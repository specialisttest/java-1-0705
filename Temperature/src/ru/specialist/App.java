package ru.specialist;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите температуру (C): ");
		double tc = sc.nextDouble();
		
		double tf = tc * 9 / 5 + 32;
		
		System.out.printf("Температура (F): %.2f\n", tf);
		
		//sc.close();
	}

}
