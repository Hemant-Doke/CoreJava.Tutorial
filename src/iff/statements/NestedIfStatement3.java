package iff.statements;

public class NestedIfStatement3 {

	public static void main(String[] args) {
		 int marks = 89;

		if (marks<40)
		{
			System.out.println("You are fail");
		}
		else
		{	
			 
			 if (marks > 40 && marks < 50) {
					System.out.println("You are just passed");
				} else if (marks >= 50 && marks < 60) {
					System.out.println("You are passed with second class");
				} else if (marks >= 60 && marks < 66) {
					System.out.println("You are passed with first class");
				} else if (marks > 90) {
					System.out.println("You have achieved silver medal");
				} 
				else
				{
					System.out.println("You are passed with distinction");
				}

				
			 
		}

	}

}
