package iff.statements;

public class NestedIfStatement2 {

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
			 int marks = 89;
			 
			 if (marks > 40 && marks < 50) {
					System.out.println("You are just passed");
				} else if (marks >= 50 && marks < 60) {
					System.out.println("You are passed with second class");
				} else if (marks >= 60 && marks < 66) {
					System.out.println("You are passed with first class");
				} else if (marks > 90) {
					System.out.println("You have achieved silver medal");

				} else if (marks >= 66) {
					System.out.println("You are passed with distinction");
				}

				else {
					System.out.println("You are failed");
				}
			 
		}

	}

}
