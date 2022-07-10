package superr;

public class B extends A{

	int aa = 440;
	static int stAA = 450;
	
public static void main(String[] args) {
		
		B obj = new B(34);
		B oo = new B();
		
		obj.nonStaticMethod();
		
		C oc = new C(45);
		
	}
	
	public B(float r)
	{
		super(34);
		System.out.println("This is parameterised B class constructor");
		
	}
	
	public B()
	{
		super(34);
		System.out.println("Default constructor of B ");
	}
	
	public static void staticMethod()
	{
		System.out.println("This is static method from B class");
		
	}
	
	public  void nonStaticMethod()
	{
		System.out.println("This is non static method from B class");
		System.out.println(this.aa);
		System.out.println(super.aa);
		System.out.println(super.stAA);
		int x = abc;
		System.out.println(abc);
		super.staticMethod();
		super.nonStaticMethod();		
		C obj = new C(abc);
		
		
				
	}
	
	

}
