package operators;

public class AssignmentOperator {

	public static void main(String[] args) {
		// Assignment Operators  = ,+= ,-= ,*= ,/= ,%= , <<= ,>>=
		
		int a = 5;
		int b = 7;
		
		float x = 90.3f;
		x<<=2; // shift is not working on float data type
		
		x*=2;
		System.out.println(x);
		
		b>>=3; // b = b>>3;  b = b/2^3;
		System.out.println(b);
		
		a<<=2; // a= a<<2; a = a* 2^2
		System.out.println(a);
		
		
		a%=5; // a = a%5
		
		System.out.println(a);
		
		b/=3; //b = b/3;
		System.out.println(b);
		
		b*=2; // b = b*2;
		
		System.out.println(b);
		
		b-=4; // b = b-4;
		System.out.println(b);
		
		a+=b; // a = a+b;
		System.out.println(a);
		System.out.println(b);
		
		  

	}

}
