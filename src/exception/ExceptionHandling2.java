package exception;

import org.omg.CORBA.CTX_RESTRICT_SCOPE;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		
		int a = 45;
		int b = 0;
		int c = 0;
		String data = "sdfsdf";
		String str = null;
		try
		{
		System.out.println("Inside try block");
		//str.toLowerCase();
		 c = a/b;	
		 System.out.println(Integer.parseInt(data));
		 System.out.println("Inside try block after arithmatic operation");
		}
		
		catch (ArithmeticException e) {
			
			c = a;
			
			e.printStackTrace();
		
		}		
		catch (NumberFormatException e) {

        System.out.println("Try block has number forrmate exception. Please check String value");
        e.printStackTrace();
		}
		
      catch (Exception e) {
			
			System.out.println("This is universal catch block");
		}
		
		
		System.out.println(c);
		
		System.out.println("After code");

	}

}
