package ru.specialist;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите ваше имя: ");
		String userName = sc.nextLine();
		
		//if (userName.isEmpty()) userName = "Незнакомец";
		userName = (userName.isEmpty()) ?  "Незнакомец" : userName;
		
		System.out.printf("Привет, %s!\n", userName);
		
		/*if (userName.isEmpty())
			System.out.println("Привет, Незнакомец!");
		else
			System.out.printf("Привет, %s!\n", userName);*/

	}

}
