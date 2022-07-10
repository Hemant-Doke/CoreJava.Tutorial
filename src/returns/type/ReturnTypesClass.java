package returns.type;

public class ReturnTypesClass {
	
	int a = 90;
	static int b = 67;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnTypesClass obj = new ReturnTypesClass();
		obj.sampleMethod1();		
		int res = obj.sampleIntMethod();
		System.out.println(res);		
		float xx = obj.additionOfTWoFloatNumber(23.4f, 45.6f);
		System.out.println(xx);
		System.out.println(obj.additionOfTWoFloatNumber(12.00f, 13.11f));
		boolean flag = ReturnTypesClass.staticMethodForReturnType(2, 45);
		System.out.println(flag);		
		

	}
	
	
	public static boolean staticMethodForReturnType(int a , int b)
	{
		System.out.println("Static method");
		boolean c = a<b;
		
		return c;
		
	}
	
	public void sampleMethod1()
	{
		System.out.println("Sample method");	
		int z = sampleIntMethod();
		System.out.println(z);
		
	}
	
	public int sampleIntMethod()
	{
		int c = 45 +55;
		int z = 78;
		
		return c;
	}
	
	public float additionOfTWoFloatNumber(float x, float y)
	{
		float c = x+y;
		
		return c;
	}
	
	
	
	
}
