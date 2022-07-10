package poly.methodoverriding;

public class B extends A{

	int aa = 450;
	static int stAA = 550;
	@Override
	public void addition(int v)
	{
		System.out.println("This is addition method from B");
		int c = aa+stAA;
		System.out.println("Addition is = "+c);
	}
	
	public static void substraction()
	{
		System.out.println("This is sunstraction method from B");
		int c = 555- stAA;
		System.out.println("Substarction = "+c);
	}
	
	public static void main(String[] args) {
		
		B bc = new C();
		bc.ac();
		
		
        A ac = new C();
		
		ac.ac();
		
		A ab = new B();		
		System.out.println(ab.aa);
		System.out.println(ab.stAA);
		ab.addition(23);
		ab.substraction();
		ab.ac();
		
		
		
			
		
		
	}

}
