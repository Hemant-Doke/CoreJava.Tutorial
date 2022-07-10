package inheritance;

public class A {
	
	public A()
	{
		System.out.println("This is A class default constructor");
	}

	int aa = 89;
	static int stAA = 66;
	
	public void nonStaticMethodFromA()
	{
		System.out.println("non Static Method From A");
		System.out.println(aa);
		System.out.println(stAA);
		staticMethodFromA();
	}

	public static void staticMethodFromA()
	{
		System.out.println("Static Method From A");	
		System.out.println(stAA);
	}
	
	public static void main(String[] args) {
		
		B bobj = new B();		
		System.out.println(bobj.aa);
		System.out.println(bobj.bb);
		System.out.println(bobj.stAA);
		System.out.println(bobj.stBB);
		bobj.nonStaticMethodFromA();
		bobj.nonStaticMethodFromB();
		bobj.staticMethodFromA();
		bobj.staticMethodFromB();
		
		
		A aObj = new A();		
		System.out.println(aObj.aa);
		System.out.println(aObj.stAA);
		aObj.nonStaticMethodFromA();
		aObj.staticMethodFromA();
		
	}
}
