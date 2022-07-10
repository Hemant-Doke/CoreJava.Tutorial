package iff.statements;

public class IfStatementClass {

	public static void main(String[] args) {
		int a = 89;
		boolean flag = true;
		
		flag = a>45;

		System.out.println("Before if statement code");
		
		// if body is not written for if then first statement after if will be considered inside if body
		if (a<56)
			System.out.println("in if");System.out.println("in if 2");
		
		
		
		/*
		 * if ("KTCTC") { System.out.println("KTCTC"); }
		 */
		
		if (flag && a<500)
		{
			System.out.println("Boolean condition");
		}
		
		if (false)
		{
			System.out.println("Hello");
		}
		
		
		if (true)
		{
			System.out.println("KTCTC");
			
		}
		
		

		if (a < 45) {
			System.out.println("inside if statement 1");
			System.out.println("inside if statement 1");
			System.out.println("inside if statement 1");

			int c = 89 + 45;
			System.out.println("Addition is = " + c);

		}

		System.out.println("After if statement code");
	}

}
