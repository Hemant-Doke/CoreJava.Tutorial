package accessA;

public class AccessClass {
	
	public int publicVariable = 78;
	private int privateVariable = 34;
	protected int protectedVariable =45;
	 int defaultVariable = 72;
	
	 public AccessClass()
	 {
		 System.out.println("Public constructor");
	 }
	 
	 private AccessClass(int pri)
	 {
		 System.out.println("private constructor");
	 }
	 protected AccessClass(int pri, int pro)
	 {
		 System.out.println("protected constructor");
	 }
	  AccessClass(int a, int b, int c)
	 {
		 System.out.println("default constructor");
	 }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessClass oo1 = new AccessClass();// public constructor
		AccessClass oo2 = new AccessClass(23); // private constructor
		AccessClass oo3 = new AccessClass(12,23); // protected constructor
		AccessClass oo4 = new AccessClass(2,4,7);// default constructor
		
		
		AccessClass obj = new AccessClass();
		System.out.println(obj.publicVariable);
		System.out.println(obj.privateVariable);
		System.out.println(obj.protectedVariable);
		System.out.println(obj.defaultVariable);
		
		obj.publicMethod();
		obj.privateMethod();
		obj.protectedMethod();
		obj.defaultMethod();
		

	}
	
	public void publicMethod()
	{
		System.out.println("public method");
	}
	private void privateMethod()
	{
		System.out.println("private method");
	}
	protected void protectedMethod()
	{
		System.out.println("protected method");
	}
	 void defaultMethod()
	{
		System.out.println("default method");
	}

}
