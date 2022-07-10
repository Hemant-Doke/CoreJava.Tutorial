package exception;

import java.sql.SQLException;

public class ThrowKeyword {

	public static void main(String[] args) throws IllegalAgeException {

		int age = 3;
		
		if (age>=18)
		{
			System.out.println("You can vote");
		}
		else
		{
			System.out.println("You can not vote");		
			IllegalAgeException obj = new IllegalAgeException("Your age is not as per voting rules of India");
			
			throw obj;
			
		}
		


	}

}
