package ru.specialist;

import java.io.Closeable;

class DBConnection implements Closeable {
	
	public DBConnection() {
		System.out.println("Open connection");
	}
	
	public void execute() {
		System.out.println("excute query");
		//throw new RuntimeException("error durining query execute");
	}
	
	public void close() {
		System.out.println("Close connection");
	}
}
public class App {

	public static void test(String s1, String s2) throws Exception {
		
		try {
			int n1 = Integer.parseInt(s1); // [0..100]
			int n2 = Integer.parseInt(s2);
			
			if (n1 < 0 || n1 > 100)
				//throw new IllegalArgumentException("n1 out of [0..100]"); // uncontrolled
				throw new Exception("n1 out of [0..100]"); // controlled
			
			int n = n1 / n2;
			
			System.out.println( n );
			
		} 
//		catch (NumberFormatException ex) {
//			System.out.println("Не число");
//			//throw new RuntimeException( ex );
//		} 
//		catch(Exception ex) {
//			System.out.println( ex.getMessage() );
//		}
		finally {
			System.out.println("finally");
			//return;
		}
		
		System.out.println("continue test");
	}
	
	public static void main(String[] args) throws Exception {
		
		try {
			test("99", "0");
		}
		catch (ArithmeticException | NumberFormatException ex) {
//		catch(Exception ex) { // не следует обычно ловить все исключения	
			//System.out.println( ex.toString() );
			ex.printStackTrace();
		}
//		catch(Exception ex) {
//			System.out.println( ex.getMessage() );
//		}
		
		System.out.println("continue main");
		
		/*DBConnection db = new DBConnection();
		try {
			db.execute();
		}
		finally {
			db.close();
		}*/
		
		// Ресурсный try
		try(DBConnection db = new DBConnection();
				DBConnection db2 = new DBConnection()) {
			db.execute();
		} // db.close()
		
		try {
			int k = Integer.MAX_VALUE;
			System.out.println( k );
			System.out.println( Math.addExact(k, 1) );
			//Math.multiplyExact(k, k)
			//Math.divideExact(k, k)
		} catch(ArithmeticException ex) {
			System.out.println( ex.getMessage() );
		}
	}

}
