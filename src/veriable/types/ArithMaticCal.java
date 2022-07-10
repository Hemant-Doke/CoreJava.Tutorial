package veriable.types;

public class ArithMaticCal {
	int a = 90;
	int b = 4;
	
	
	public void addition()
	{
		int c = a +b;
		System.out.println(c);
	}
	public void substraction()
	{
		int c = a-b;
		System.out.println(c);
	}
	// 92, 94, 101, 99
	public void sample()
	{
		ArithMaticCal oo = new ArithMaticCal();
		
		int c = oo.a + b;
		System.out.println("Sample addition = "+c);
		
	}

}
