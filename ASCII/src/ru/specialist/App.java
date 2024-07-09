package ru.specialist;

public class App {

	public static void main(String[] args) {
		System.out.print("   ");
		for(int i=0; i <= 0xF; i++)
			System.out.printf("%3X", i);
		System.out.println();
		
		for(int row=0; row <= 0xF; row++) {
			System.out.printf("%3X", row);
			
			for(int col=0; col <= 0xF; col++) {
				char ch = (char)((col << 4) + row);
				if (ch < 0x21 || col == 0x8 || col == 0x9) ch = ' ';
				System.out.printf("%3c", ch);
			}

			System.out.println();
		}
		//System.out.println((char)0xA5);
		//System.out.println((char)0xD7);
	}

}
