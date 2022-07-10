package exception;

import org.omg.CORBA.CTX_RESTRICT_SCOPE;

public class ExceptionHandling3 {

	public static void main(String[] args) {

		int a = 45;
		int b = 0;
		int c = 0;
		String data = "sdfsdf";
		String str = null;

		try {
			c = a / b;
		} catch (ArithmeticException e) {
			c = a;

			e.printStackTrace();
		}
		
		try {			

			System.out.println(Integer.parseInt(data));
			
		}

		catch (NumberFormatException e) {
			System.out.println("Please check string");
		}

		
		System.out.println(c);

		System.out.println("After code");

	}

}
