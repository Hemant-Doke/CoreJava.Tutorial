package returns.type;

import java.awt.image.SampleModel;

public class ReturnTypesClass3 {
	
	static int a = 90;
	static int b = 6;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(sampleNonStaticMethod6());

	}
	
	// method with void return type can not have return statement
	public void sampleNonStaticMethod()
	{
		int  c = a +b;
		System.out.println(c);
		return c;
		
	}
	// Method with other than void return type must have return statement
	public int sampleNonStaticMethod1()
	{
		int  c = a +b;
		System.out.println(c);		
		
	}
	// Return should be last statement in method
	public int sampleNonStaticMethod2()
	{
		int  c = a +b;
		System.out.println(c);		
		return c;
		System.out.println("Hi how are you?");
	}
	
	public int sampleNonStaticMethod3()
	{
		int  c = a +b;
		System.out.println(c);		
		return c;
		return 56;
	}
	
	// Below method gives error as if a is less then return statement will not gets executed
	public int sampleNonStaticMethod4()
	{
		int  c = a +b;
		System.out.println(c);		
		if (c>10)
		{
			return c;
		}
		
		
	}
	// Below code is allowed as only 1 return statement will get executed
	public int sampleNonStaticMethod5()
	{
		int  c = a +b;
		System.out.println(c);		
		if (c>10)
		{
			return c;
		}
		else
		{
			return 5;
		}
		
		
	}
	
	public static int sampleNonStaticMethod6()
	{
		int  c = a +b;
		System.out.println(c);		
		if (c<10)
		{
			return c;
		}
		
		return 45;
	}
	
	
	
	
}
