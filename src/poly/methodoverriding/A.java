package poly.methodoverriding;

public class A {

	int aa = 45;
	static int stAA = 55;
	int aaa = 77;
	
	public void addition(int z)
	{
		System.out.println("This is addition method from A");
		int c = aa+stAA;
		System.out.println("Addition is = "+c);
	}
	
	public static void substraction()
	{
		System.out.println("This is sunstraction method from A");
		int c = 555- stAA;
		System.out.println("Substarction = "+c);
	}
	
	public void ac()
	{
		System.out.println("This ac method from A class");
	}

}
