package iff.statements;

public class IfElseStatement {

	public static void main(String[] args) {
		int a = 89;
		boolean flag = true;
		int age =19;
		char ch = 'a';
		
		flag = a>45;

		System.out.println("Before if statement code");
		
		
		if(a<45)
			System.out.println("Hello");
		else
			System.out.println("Hi 1");
		System.out.println("Hi 2");
		
		if (false)
		{
			System.out.println("Inside if");
		}
		else
		{
			System.out.println("Inside else");
		}
		
		if (true)
		{
			System.out.println("Inside if");
		}
		else
		{
			System.out.println("Inside else");
		}
		
		if (ch=='a' || ch=='e' || ch=='i' ||ch=='u'||ch=='o')
		{
			System.out.println("Provided character is vovel");
		}
		else
		{
			System.out.println("Provided character is consonent");
		}
		
		
		if (age>=18)
		{
			System.out.println("You can vote");
		}
		else
		{
			System.out.println("You can not vote");
		}
		
		
		if (a>45)
		{
			System.out.println("Inside if 1");
			System.out.println("Inside if 2");
		}
		else
		{
			System.out.println("Inside else 1");
			System.out.println("Inside else 2");
			
		}
		
		
		System.out.println("After if statement code");

	}

}
