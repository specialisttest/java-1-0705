package ru.specialist;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Pattern;


public class App {
	public static String toBinary(byte n) {
		return toBinary(n, 8);
	}
	
	public static String toBinary(short n) {
		return toBinary(n, 16);
	}
	
	public static String toBinary(int n) {
		return toBinary(n, 32);
	}
	public static String toBinary(long n) {
		return toBinary(n, 64);
	}
		
	public static String toBinary(long n, final int size) {
		char[] bits = new char[size];
		
		for(int i = size-1; i >=0; i--) {
			bits[i] = ( (n & 1) == 0) ? '0' : '1';
			n >>= 1; // n = n >> 1
		}
		
		return new String(bits);
	}
	
	public String toString() {	
		return "My Application";
	}

	public static void main(String[] args) {
		String s1 = new String("abc"); // 1
		String s2 = new String("abc"); // 2
		new String(new char[] {'a', 'c'});
		String s3 = "cde"; // 3
		String s4 = "cde"; // 3
		
		String s5 = "cd\"e\n\t \\  \u002F";
		
		String hello = "Привет";
		String name = "Сергей";
		String r = hello + " " + name + "!";
		
		/*
		 * "Привет"
		 * "Привет "
		 * "Привет Сергей"
		 * "Привет Сергей!"
		 * 
		 */
		
		System.out.println(r);
		System.out.println(r.length());
		System.out.println(r.charAt(0));
		System.out.println(r.charAt(r.length()-1));
		
		System.out.println( r.contains("Сергей") );
		System.out.println( r.indexOf("Сергей") );
		System.out.println( r.trim() );
		System.out.println( r.substring(7, 13) );
		System.out.println( r.replace("Сергей", "Андрей") );
		System.out.println( r );
		r = r.toUpperCase();
		System.out.println( r );
		System.out.println( r.toLowerCase() );
		
		String t1 = new String("Hello"); //new Scanner(System.in).nextLine();
		String t2 = "Hello";
		
		//System.out.println(t1 == t2); // by ref
		System.out.println( t1.equals(t2) ); // by val
		
		System.out.println( new App().toString() );
		
		int k = 5;
		String ks = String.valueOf(k);
		System.out.println(ks);
		String as = String.format("%s - %d", new App(), k);
		System.out.println(as);
		String test = "This is test";
//		String[] words = test.split("\\s");
//		for(String s : w) System.out.println(s);
		StringTokenizer st = new StringTokenizer(test);
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
		
		// 1 2 3 4 .. 100
		
		// VERY BAD (fired!!!)
//		String result = "";
//		for(int i=1; i <= 100; i++)
//			result += String.valueOf(i) + " ";
		/*
		 * "1"
		 * "1 "
		 * "1 2"
		 * "1 2 "
		 * 
		 * 
		 */
		// StringBuffer - tread safe
		StringBuilder sb = new StringBuilder();
		for(int i=1; i <= 100; i++)
			sb.append(i).append(" ");
		
		String result = sb.toString();
		
		System.out.println(result);
		
		String phone = "123-45-67";
		String phonePattern  = "[1-9]\\d{2}-\\d\\d-\\d\\d";
		System.out.println(phone.matches(phonePattern));
		
		String[] courses = //new String[4];
			{  "Java Client-Server", "Java 1. Base", "Spring", "Java 2. OOP" };
		
		Pattern p = Pattern.compile("^J.+");
		
		for(var course : courses)
			if (p.matcher(course).matches())
				System.out.println(course);
		
		System.out.println( toBinary(5) );
		System.out.println( toBinary(7) );
		System.out.println( toBinary(-5) );
		System.out.println( toBinary(-7) );
		short b1 = 5;
		short b2 = -5;
		System.out.println( toBinary(b1) );
		System.out.println( toBinary(b2) );
		
		
	}

}
