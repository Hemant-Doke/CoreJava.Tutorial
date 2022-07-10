package inheritance;

public class C extends B{
	public C()
	{
		System.out.println("This is C class default constructor");
	}

	int cc = 89;
	static int stCC = 66;
	
	public void nonStaticMethodFromC()
	{
		System.out.println("non Static Method From C");
		System.out.println(aa);
		System.out.println(stAA);
		staticMethodFromA();
	}

	public static void staticMethodFromC()
	{
		System.out.println("Static Method From C");	
		System.out.println(stAA);
	}
	
	public static void main(String[] args) {		
		
		B ob = new B();
		
		C co = new C();		
		System.out.println(co.aa);
		System.out.println(co.bb);
		System.out.println(co.cc);
		System.out.println(co.stAA);
		System.out.println(co.stBB);
		System.out.println(co.stCC);
		co.staticMethodFromA();
		co.staticMethodFromB();
		co.staticMethodFromC();
		co.nonStaticMethodFromA();
		co.nonStaticMethodFromB();
		co.nonStaticMethodFromC();
		
		
	}
}
