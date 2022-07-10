package scanner;

import java.util.Scanner;

public class ScannerClass2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);		
		System.out.println("This code is for addition");
		System.out.println("Please enter first integer number...");
		int a = sc.nextInt();
		System.out.println("Please enter Second integer number...");
		int b = sc.nextInt();		
		int c = a +b;
		System.out.println("Addition is = "+c);

	}

}
