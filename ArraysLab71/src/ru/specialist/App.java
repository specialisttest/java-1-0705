package ru.specialist;

import java.util.Arrays;
import java.util.Scanner;

public class App {
	
	public static int[] inputArray() {
		try(Scanner sc = new Scanner(System.in)) {
			System.out.print("Введите размер массива: ");
			int size = sc.nextInt();
			int[] nums = new int[size];
			for(int i=0; i < nums.length; i++) {
				System.out.printf("m[%d] = ", i+1);
				nums[i] = sc.nextInt();
			}
			return nums;
		}
		
	}
	
	public static int[] analyzeArray(int... nums) {
		int min = nums[0];
		int max = nums[0];
		int summa = 0;
		for(int i = 0; i < nums.length; i++) {
			summa += nums[i];
			if (nums[i] < min) min = nums[i]; 
			if (nums[i] > max) max = nums[i];
		}
		return new int[] {min, max, summa};
		
	}
	
	public static double mediana(int... nums) {
		nums = nums.clone();
		Arrays.sort(nums);
		if (nums.length % 2 == 1)
			return nums[nums.length / 2];
		else
			return (nums[nums.length / 2 - 1] + nums[nums.length / 2]) / 2D;
	}
	
	public static void print(int min, int max, int summa, double avg, double mediana) {
		System.out.printf("Min: %d\nMax: %d\nSum: %d\n"
				+ "Average: %f\nMediana : %f\n",
				min, max, summa, avg, mediana);
	}
	public static void printArray(int[] nums) {
		for(int k : nums) System.out.printf("%-5d", k);
		System.out.println();
	}

	public static void main(String[] args) {
		int[] m = inputArray();
		int[] r = analyzeArray(m);
		double avg = (double)r[2] / m.length;
		printArray(m);
		double mediana = mediana(m);
		printArray(m);
		print(r[0], r[1], r[2], avg, mediana);

	}

}
