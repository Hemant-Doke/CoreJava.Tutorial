package exception;

public class FinallyBlock {

	public static void main(String[] args) {

		int a = 545;
		int b = 4;

		try {
			System.out.println("I am inside try block");
			int c = a / b;
		} catch (Exception e) {
			System.out.println("I am inside catch");
			
			e.printStackTrace();
		}
		finally {
			System.out.println("I am inside finally");
			
		}
		

	}

}
