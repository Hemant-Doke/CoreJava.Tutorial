package veriable.types;

public class StaticKeywords {
	String name = "Hello";
	int age = 18;
	float height;	
	
	static int abcd ;
	

	public static void main(String[] args) {
		
		StaticKeywords.abcd = 88;
		System.out.println(StaticKeywords.abcd);
		StaticKeywords.sampleStaticMethod();
		StaticKeywords.sampleNonStaticMethod(); // we can not access non static method by using class name
		System.out.println(StaticKeywords.name);// we can not access instance variable by using class name 
		
		StaticKeywords obj = new StaticKeywords();
		System.out.println(obj.name);
		System.out.println(obj.abcd);
		obj.sampleStaticMethod();
		obj.sampleNonStaticMethod();
		

	}
	
	public static void sampleStaticMethod()
	{
		System.out.println("sample Static Method");
	}
	
	public void sampleNonStaticMethod()
	{
		System.out.println("sample Non Static Method");
	}
	
	


}
