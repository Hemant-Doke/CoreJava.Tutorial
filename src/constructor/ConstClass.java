package constructor;

public class ConstClass {
	int a = 90;
	String name = "ABCD";
	
	public ConstClass(int z, String str)
	{
		a = z;
		name = str;
		System.out.println("I am inside parameterized constructor");
	}
	
	public ConstClass()
	{
		System.out.println("I am inside default constructor");
	}
	
	public ConstClass(int x)
	{
		a = x;
		System.out.println("I am inside single parameterized constructor");
	}
	
	public ConstClass(String str,int z)
	{
		a = z;
		name = str;
		System.out.println("I am inside parameterized constructor");
	}
	
	public ConstClass(float str,float z)
	{
		
		System.out.println("I am inside parameterized constructor");
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstClass obj = new ConstClass(23, "PQRS");
		ConstClass oo = new ConstClass();
		
		ConstClass obj1 = new ConstClass(44);
		ConstClass obj2 = new ConstClass("GHJK", 555);

		obj.sample();
		obj.sample();
		obj.sample();
		obj.ConstClass();
		obj.ConstClass();
		obj.ConstClass();
		
		sample();
		
	}
	
	public static void sample()
	{
		System.out.println("Hi");
	}
	
	public void ConstClass()
	{
		System.out.println("Method with class name");
	}

}
