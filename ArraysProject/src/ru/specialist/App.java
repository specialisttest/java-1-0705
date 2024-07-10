package ru.specialist;

import java.util.Arrays;
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
					{  "Java Client-Server", "Java 1. Base", "Spring", "Java 2. OOP" };
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
		
		nums = new int[] {12, 3, 56, 67, 13, 1000, 25, 75, 34};
		
		for(int k : nums) System.out.printf("%-5d", k);
		System.out.println();
		
		//int[] empty = new int[0];
		
		// Сложность O(n)
		int min = nums[0];
		int max = nums[0];
		for(int i = 1; i < nums.length; i++) {
			if (nums[i] < min) min = nums[i]; // O(1)
			if (nums[i] > max) max = nums[i];
		}

		
		long summa = 0;
		for(int k : nums)
			summa += k;  // Math.addExact()
		
		double avg = (double)summa / nums.length;
		
		System.out.printf("Min: %d\nMax: %d\nSum: %d\nAvg: %f\n", 
				min, max, summa, avg);
		
		// Bubble sort O(n^2)
		for(int i = 0; i < nums.length-1; i++) {
			for(int j = i+1; j < nums.length; j++)
				if (nums[i] > nums[j]) {
					int k = nums[j];
					nums[j] = nums[i];
					nums[i] = k;
				}
		}
		
		for(int k : nums) System.out.printf("%-5d", k);
		System.out.println();		
		// qsort
		
		for(String course : courses)
			System.out.println(course);
		
		Arrays.sort(courses);
		
		for(String course : courses)
			System.out.println(course);
		
		{ // value type
			int x = 10;
			int y = x;
			x++;
			System.out.printf("x = %d\ny = %d\n", x, y); // 11 10
			
		}
		{ // reference type
			int[] x = {10};
			int[] y = x; // copy reference (копирование ссылки на тот же массив)
			//int[] y = x.clone(); // copy array (создание копии массива и новой ссылки на копию)
			x[0]++;
			System.out.printf("x = %d\ny = %d\n", x[0], y[0]); // 11 11
			
		}	
		
		int[][] matrix = {
				{1,2,3},
				{4,5}
		};
		
		System.out.println(matrix.length);
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++)
				System.out.printf("%-3d", matrix[i][j]);
			System.out.println();
		}
			

	}

}
