package finall;

public class ChildClass extends FinalClass{

	
	public void sampleNonStaticMethod()
	{
		System.out.println("sample Non Static Method");
		System.out.println("sfdafsdf");
		int c = 34+454;
		
		System.out.println("addition = "+c);
	}
	
	public  void sampleStaticMethod()
	{
		System.out.println("sample  Static Method");
	}
	
	public final void sm()
	{
		System.out.println("SM method");
		System.out.println();
	}
}
