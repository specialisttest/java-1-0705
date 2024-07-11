package ru.specialist;

public class Course implements Comparable<Course> {
	
	// поля описывают данные (состояние) объектов
	public String title;
	public int length;
	
	// методы описывают операции (поведение) объектов

	public Course() {
		this("Новый курс");
	}
	public Course(String title) {
		this(title, 16);
	}
	
	public Course(String title, int length) {
		this.title = title;
		this.length = length;
	}
	
	public void print() {
		String title ="abc";
		// title
		// this.title
		
		// this - автоматическая переменная содержит ссылку на объект для которого вызван данный метод
		System.out.printf("%s : %d\n", this.title, length);
	}
	
	@Override
	public int compareTo(Course c) {
		//return this.length - c.length;
		//return this.title.compareTo(c.title);
		if (this.length > c.length) return 1;
		if (this.length < c.length) return -1;
		return 0;
	}
	
	
}
