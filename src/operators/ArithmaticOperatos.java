package operators;

public class ArithmaticOperatos {

	public static void main(String[] args) {
		// Arithmatic operator +,-,*,/,%
		
		int a = 90;
		byte b = 7;
		byte tt = 76;
		float x = 55.45f;
		float y = 12.50f;		
		
		float j = x%y;
		System.out.println(j);
		
		int i = a%b;
		System.out.println(i);		
		
		float h = a/x;
		System.out.println(h);
		float g = x/y;
		System.out.println(g);
		
		int f = a/b;
		System.out.println(f);
	
		
		float e = a*x;
		System.out.println(e);		
		
		int d = a-b;
		System.out.println(d);
		
		String str1 = "Welcome to ";
		String str2 = "KTCTC";
		
		
		String str3 = str1+str2;
		System.out.println(str3);
		char ch = 'a';		
		int c = a + b;		
		int z = ch+a;
		System.out.println(z);
		System.out.println(c);		
		System.out.println(str2+a+b);  // KTCTC907, KTCTC97		
		System.out.println(a+b+str2); // 907KTCTC, 97KTCTC
		System.out.println(a+b+c);
		System.out.println(str2+(a+b));
		System.out.println(ch+a);
		

	}

}
