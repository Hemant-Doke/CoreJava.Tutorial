package inheritance;

public class D extends A{

	int dd = 89;
	static int stDD = 66;
	
	public void nonStaticMethodFromD()
	{
		System.out.println("non Static Method From D");
		
	}

	public static void staticMethodFromD()
	{
		System.out.println("Static Method From D");	
		
	}
	
	public static void main(String[] args) {		
		
		D doo = new D();		
		System.out.println(doo.aa);
		System.out.println(doo.stAA);
		
	
		doo.nonStaticMethodFromA();
		doo.staticMethodFromA();
		
	}
}
