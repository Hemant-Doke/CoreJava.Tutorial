package finall;

public final class FinalClass {
	final int ABCD;
	static final int PQRS;
	
	static int fgh = 45;
	
	public FinalClass(int a) {
		ABCD = a;
	}

	public FinalClass() {
		ABCD = 567;

	}

	 static {
		PQRS = 77;
		System.out.println("I am inside static block");
		int a = 56;
		FinalClass oo = new FinalClass();
		oo.sm();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int z;
		z = 23;
		// z = 54;
		// FinalClass.pqrs = 55;
		FinalClass obj3 = new FinalClass();

		FinalClass obj = new FinalClass(12);
		FinalClass obj2 = new FinalClass(33);

		// obj.abcd = 77;
		// obj.pqrs = 44;

	}
	

	
	public final void sampleNonStaticMethod()
	{
		System.out.println("sample Non Static Method");
	}
	
	static public final  void sampleStaticMethod()
	{
		System.out.println("sample  Static Method");
	}
	
	public void sm()
	{
		System.out.println("SM method");
		System.out.println("sfdasfsfsdf");
	}

}
