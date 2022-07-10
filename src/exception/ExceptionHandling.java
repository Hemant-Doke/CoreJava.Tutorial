package exception;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		int a = 45;
		int b = 3;
		int c = 0;
		String data = "sdfsdf";
		try
		{
		System.out.println("Inside try block");
		 c = a/b;	
		 System.out.println(Integer.parseInt(data));
		 System.out.println("Inside try block after arithmatic operation");
		}		
		catch (ArithmeticException e) {
			
			c = a;
			
			e.printStackTrace();
		
		}
		
		System.out.println(c);
		
		System.out.println("After code");

	}

}
