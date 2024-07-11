package ru.specialist;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		String name = "Sergey";
		int salary = 1000;
		int salary2 = 500;
		
		System.out.printf("%s : %d\n", name, salary2);
		
		Course c1 = new Course("Java 1. Base level", 40);
		
//		c1.title = "Java 1. Base level";
//		c1.length = 40;
		
		c1.print(); // this = c1
		
		Course c2 = new Course("Java 2. OOP", 40);
//		c2.title = "Java 2. OOP";
//		c2.length = 40;
		
		c2.print(); // this = c2
		
		Course cx = new Course();
		cx.print();
		
		Course[] courses = new Course[] {c1, c2, cx, new Course("Pattern OOP", 24)};
		for(Course course : courses)
			course.print();
		
		Arrays.sort(courses); // не работает т.к. не реализован интерфейс Comparable
		
		/*for(int i = 0; i < courses.length-1; i++) {
			for(int j = i+1; j < courses.length; j++)
				//if (courses[i].length > courses[j].length) { // сортировка по длительности
				if (courses[i].title.compareTo(courses[j].title) > 0) { // сортировка по алфавиту
					Course k = courses[j];
					courses[j] = courses[i];
					courses[i] = k;
				}
		}*/
		
		for(Course course : courses)
			course.print();
		
		
		Point p1 = new Point(1, 1);
		Point p2 = new Point(3, 1);
		Point p3 = new Point();
		
		Point[] points = new Point[] {p1, p2, p3, new Point(5, 6), new Point(1, 0)};
		
		for(int i = 0; i < points.length-1; i++) {
			double pid = points[i].distance();
			for(int j = i+1; j < points.length; j++)
				if (pid > points[j].distance()) { 
					Point k = points[j];
					points[j] = points[i];
					points[i] = k;
				}
		}
		
		for(var point : points) point.draw();
		
//		p1.draw();
//		p2.draw();
//		p3.draw();
		
//		System.out.println(p1.distance());
//		System.out.println(p2.distance());
//		System.out.println(p3.distance());
		
	}

}
