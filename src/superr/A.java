package superr;

public class A {

	int aa = 44;
	static int stAA = 45;
	int abc = 46;
	
	public A(int a)
	{
		
		System.out.println();
		
	}
	/*
	 * public A() { System.out.println("Default constructor of A"); }
	 */
	
	public static void staticMethod()
	{
		System.out.println("This is static method from A class");
	}
	
	public  void nonStaticMethod()
	{
		System.out.println("This is non static method from A class");
		aMethod();
		System.out.println(aa);
	}
	
	public void aMethod()
	{
		System.out.println("a Method");
	}
	
	public static void main(String[] args) {
		
		A oo = new A(34);
		
		
	}

}
