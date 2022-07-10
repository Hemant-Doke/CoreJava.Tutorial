package iff.statements;

public class NestedIfStatement {

	public static void main(String[] args) {
int a = 2;
int b = 8;

		if (a>5)
		{
			System.out.println("a's value is greater than 5");
			
			if (b>55)
			{
				System.out.println("b's value is greater than 55");
				
			}
			else
			{
				System.out.println("Inner else");
			}
		}
		else
		{
			System.out.println("Outer else");
			 if (a>0 && b>0)
			 {
				 System.out.println("a and b are positive numbers");
			 }
		}

	}

}
