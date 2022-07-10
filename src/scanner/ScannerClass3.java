package scanner;

import java.util.Scanner;

public class ScannerClass3 {

	public static void main(String[] args) {
        int password = 3456;        
		Scanner sc = new Scanner(System.in);	
		System.out.println("Please enter your password");
		
		String as = sc.nextLine();
		char ch = as.charAt(0);
		System.out.println(ch);
		
		
		int a = sc.nextInt();	
		
		
		if (password==a)
		{
			System.out.println("You have logged in successfully..");
		}
		else
		{
			System.out.println("Your password is incorrect. You could not login to system");
		}
		
		

	}

}
