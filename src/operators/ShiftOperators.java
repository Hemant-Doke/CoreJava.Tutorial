package operators;

public class ShiftOperators {

	public static void main(String[] args) {
		// Shift Operators <<,>>
		
		int a = 58;// 0000 0000 0000 0000 0000 0000 0011 1010
		int b = 13;// 0000 0000 0000 0000 0000 0000 0000 1101
		
	   33%32
		
		int d = b>>33;// 000000 0000 0000 0000 0000 0000 0000 11 // b/2^1  
		System.out.println(d);
		
		int c = a<<35;// 0 0000 0000 0000 0000 0000 0011 1010000 // a * 2^3
		System.out.println(c);
		   

	}

}
