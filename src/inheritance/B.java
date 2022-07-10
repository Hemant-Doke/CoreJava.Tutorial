package inheritance;

public class B extends A {
	public B()
	{
		System.out.println("This is B class default constructor");
	}

	int bb = 23;
	static int stBB = 22;
	
	public void nonStaticMethodFromB()
	{
		System.out.println("non Static Method From B");
		System.out.println(aa);
		System.out.println(stAA);
		System.out.println(bb);
		System.out.println(stBB);
		
		staticMethodFromA();
		staticMethodFromB();
		nonStaticMethodFromA();
		
	}

	public static void staticMethodFromB()
	{		
		System.out.println("Static Method From B");
		
		System.out.println(stAA);
		
		System.out.println(stBB);
		staticMethodFromA();
		
		
	}
}
