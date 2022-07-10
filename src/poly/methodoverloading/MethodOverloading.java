package poly.methodoverloading;

public class MethodOverloading {
	int a = 23;
	int b = 22;

	public MethodOverloading() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading obj = new MethodOverloading();
		
		obj.addition();
		obj.addition(230, 330, 0);
		obj.addition(23.34f, 45.56f);

	}
	
	public void addition()
	{
		int c = a +b;
		System.out.println("Addition = "+c);
	}
	
	public void addition(int a, int b, int c)
	{
		int d = a +b +c;
		System.out.println("Addition = "+c);
	}
	
	public void addition(float x, float y)
	{
		float c = x+y;
		System.out.println("Addition = "+c);
	}
	
	public static void addition(float a, int b)
	{
		float c = a+b;
		System.out.println("Addition = "+c);
	}
	
	public static void substraction(int a, int b)
	{
		int c = a-b;
		System.out.println("Sunstraction = "+c);
	}
	
	public static void substraction(float a, float b)
	{
		float c = a-b;
		System.out.println("Sunstraction = "+c);
	}

}
