package scope.of.variables;

public class SccopeClass {
	
	int a = 90;
	static int b = 77;
	
	public void nonstaticMethod()
	{
		System.out.println(b);
		System.out.println(a);
		
		int aa = 89;
		
		if (a>50)
		{
			int bb = 67;
			System.out.println(b);
			System.out.println(a);
			System.out.println(aa);
			System.out.println(gt);
			
			for (;bb<90;)
			{
				int cc = 34;
				System.out.println(b);
				System.out.println(a);
				System.out.println(aa);
				System.out.println(bb);
				System.out.println(cc);
			}
			System.out.println(bb);
			int gt = 87;
		}
		System.out.println(bb);
		
	}
	
	public static void staticMethod()
	{
		int z = 9;
		System.out.println(z);
		
		System.out.println(b);
		System.out.println(a);
	}
	
	
	

}
