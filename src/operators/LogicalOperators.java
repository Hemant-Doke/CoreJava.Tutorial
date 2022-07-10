package operators;

public class LogicalOperators {

	public static void main(String[] args) {
		//  Logical operators  && , ||
		
		boolean a = true;
		boolean b = false;
		int x = 90;
		int y = 45;
		int z = 34;
		
		boolean h = (x<y)||a;
		System.out.println(h);
		
		boolean f = (x<y)&&a;  // false && true
		System.out.println(f);
		boolean g =  (x<y)&a;
		System.out.println(g);
		
		
		boolean d = a||b;
		System.out.println(d);
		
		boolean c = a&&b;
		System.out.println(c);
		
		boolean e = a&b; // bitwise operators can be used for logical operations as well
		System.out.println(e);
		
		  

	}
	
	public void ss()
	{
		System.out.println("Hello");
	}

}
