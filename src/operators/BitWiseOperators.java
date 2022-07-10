package operators;

public class BitWiseOperators {

	public static void main(String[] args) {
		// Bitwise Operators  &,^,| 
		
		int a = 58;// 0000 0000 0000 0000 0000 0000 0011 1010
		int b = 13;// 0000 0000 0000 0000 0000 0000 0000 1101
		int x = 10;// 0000 0000 0000 0000 0000 0000 0000 1010
		
		int g = a&b; // 0000 0000 0000 0000 0000 0000 0000 1000
		System.out.println(g);
		
		// 1101
		int f = a^x; // 0000 0000 0000 0000 0000 0000 0000 1101
		
		System.out.println(f);
		
		int e = b|x; // 0000 0000 0000 0000 0000 0000 0000 1110
		System.out.println(e);
		
		int d = a|b; // 0000 0000 0000 0000 0000 0000 0000 0111
		System.out.println(d);
		
		int c = a&b;// 0000 0000 0000 0000 0000 0000 0000 0110
		System.out.println(c);
		
		boolean y = a&&b; // logical operators can not be used with integer operands or logical operators can not do bitwise operations
		
		
		
		  
		

	}

}
