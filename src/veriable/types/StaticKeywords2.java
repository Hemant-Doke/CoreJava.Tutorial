package veriable.types;

public class StaticKeywords2 {
	String name = "Hello";
	int age = 18;
	float height;	
	
	static int abcd ;
	

	public static void main(String[] args) {
		
	
		
		StaticKeywords2.sampleStaticMethod2();
		
		StaticKeywords2 obj = new StaticKeywords2();
		obj.height = 90;
		obj.sampleNonStaticMethod2();
		StaticKeywords2 obj1 = new StaticKeywords2();
		obj1.sampleNonStaticMethod2();
		

	}
	public static void sampleStaticMethod2()
	{
		StaticKeywords2 oo = new StaticKeywords2();
		
		System.out.println(abcd);
		System.out.println(oo.height);
		System.out.println(height);// we can not use non static members of class inside static method without creating object
		System.out.println("sample Static Method 2");
		sampleStaticMethod();
		oo.sampleNonStaticMethod();
		sampleNonStaticMethod();//we can not use non static members of class inside static method without creating object
		
	}
	
	public void sampleNonStaticMethod2()
	{

		System.out.println(abcd);
		System.out.println(height);
		System.out.println("sample Non Static Method 2");
		sampleStaticMethod();
		sampleNonStaticMethod();
		
	}
	
	public static void sampleStaticMethod()
	{
		int abcd = 90;
		float height = 5.6f;
		System.out.println(abcd);
		System.out.println(height);
		System.out.println("sample Static Method");
	}
	
	public void sampleNonStaticMethod()
	{

		int abcd = 90;
		float height = 5.6f;
		float c = abcd+height;
		System.out.println(abcd);
		System.out.println(height);
		System.out.println("sample Non Static Method");
	}
	
	
	


}
