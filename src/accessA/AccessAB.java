package accessA;

public class AccessAB {
	
	public AccessAB()
	{
		
	}

	public static void main(String[] args) {
		AccessClass obj = new AccessClass();
		System.out.println(obj.publicVariable);
		System.out.println(obj.privateVariable);
		System.out.println(obj.protectedVariable);
		System.out.println(obj.defaultVariable);
		
		obj.publicMethod();
		obj.privateMethod();
		obj.protectedMethod();
		obj.defaultMethod();
		
		AccessClass oo1 = new AccessClass();// public constructor
		AccessClass oo2 = new AccessClass(23); // private constructor
		AccessClass oo3 = new AccessClass(12,23); // protected constructor
		AccessClass oo4 = new AccessClass(2,4,7);// default constructor
		

	}

}
