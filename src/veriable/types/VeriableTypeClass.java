package veriable.types;

public class VeriableTypeClass {
	String name = "Hello";
	int age = 18;
	float height;	
	
	static int abcd = 65;
	

	public static void main(String[] args) {
		
		VeriableTypeClass.abcd = 88;
		System.out.println(VeriableTypeClass.abcd);
		
		VeriableTypeClass obj = new VeriableTypeClass();
		VeriableTypeClass obj1 = new VeriableTypeClass();
		
		System.out.println(obj.abcd);
		System.out.println(obj1.abcd);
		
		obj.abcd = 90;
		obj.name = "Ganesh";
		System.out.println(obj.abcd);
		System.out.println(obj1.abcd);
		
		System.out.println(obj.name);
		System.out.println(obj1.name);
		System.out.println(obj1.abcd);
		
		
		String name = "KTCTC";
		int c = 90;
		System.out.println(c);
		System.out.println(name);
		System.out.println(obj.name);
	System.out.println(obj.c);

	}
	
	public static void sampleStaticMethod()
	{
		int a = 90;
		int b = 67;	
		int c;
		
		System.out.println(c);
		 c = a +b;
		
		float a = 89.55f; // we can not create local variable of same name
		System.out.println(c);
		System.out.println(a);
		System.out.println("sample Static Method");
	}
	
	


}
