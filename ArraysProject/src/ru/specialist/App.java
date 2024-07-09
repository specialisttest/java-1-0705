package ru.specialist;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*int x1 = 100, x2 = 200, x3 = 300;
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);*/
		
//		int[] nums = new int[3]; // заполняется 0
//		nums[0] = 100;
//		nums[1] = 200;
//		nums[2] = 300;
		
//		int[] nums = new int[] {100, 200, 300};
		
		int[] nums = {100, 200, 300};
		
		System.out.println(nums.length);
		for(int k : nums) {
			k++; // modify copy, array unmodified
			System.out.println( k );
		}
		for(int i = 0; i < nums.length; i++)  {
			nums[i]++; // modify array element
			System.out.printf("nums[%d] = %d\n", i, nums[i] );
		}
		
		String[] courses = //new String[4];
					{ "Java 1. Base", "Java 2. OOP", "Java Client-Server", "Spring"};
		System.out.println(courses.length);
		//System.out.println(courses[0].toUpperCase());
		//for(int i = 0; i < courses.length; i++)
		//	System.out.println(courses[i]);
		for(String course : courses)
			System.out.println(course);
		
//		System.out.print("Введите количество doubles: ");
//		int size = new Scanner(System.in).nextInt();
//		double[] doubles = new double[size];
//		System.out.println(doubles.length);
		
		
	}

}
