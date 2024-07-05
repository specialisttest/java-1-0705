package ru.specialist;

public class App {

	public static void main(String[] args) {
		int radius = 10;
		
		double circleLength = 2 * Math.PI * radius;
		double circleSquare = Math.PI * radius * radius;
		
		System.out.printf("Длина окружности: %6.2f\n", circleLength);
		System.out.printf("Площадь круга   : %6.2f\n", circleSquare);
	}

}
