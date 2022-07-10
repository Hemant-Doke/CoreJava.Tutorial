package thiss.keyword;

public class ConstInvoke {
	
	int a;
	int b;
	
	public ConstInvoke() 
	{
		this(33,56);
		System.out.println("This is default constructor");
	}

	public ConstInvoke(int a) 
	{
		
		System.out.println("This is single parameter constructor");
		this.a = a;
	}
	public ConstInvoke(int x, int y) 
	{
		this(44);		
		this.sampleMethod();
		System.out.println("This is two parameter constructor");
		a = x;
		b = y;
	}
	
	public static void main(String[] args) {
		
		ConstInvoke obj2 = new ConstInvoke();
		
		ConstInvoke oo = new ConstInvoke(33);
		
		ConstInvoke obj = new ConstInvoke(22, 33);
		
		
	}
	public void sampleMethod()
	{
		this();
	}
	

}
