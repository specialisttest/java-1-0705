package ru.specialist;

public class Point {
	 
	public int x;
	public int y;
	
	public Point() {
		this(0, 0);
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void draw() {
		System.out.printf("Point (%d, %d)\n", this.x, this.y);
	}
	
	public double distance() {
		return Math.sqrt( x * x + y * y );
	}

}
