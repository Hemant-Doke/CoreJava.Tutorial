package wrapper;

public class WrapperClass {
	
	public WrapperClass(int a)
	{
		
	}

	public static void main(String[] args) {	
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		WrapperClass oo = WrapperClass.sm(23); // new WrapperClass(a);		
		System.out.println(oo);		
		String str = "344445";		
		Integer abb = new Integer(str);		
		int acc = Integer.parseInt(str);// imp
		int add = Integer.valueOf(str);
		
		System.out.println(add);
		
		System.out.println(acc);
		
		System.out.println(abb);
     
		
	Integer abc = 23;
	int z = abc;
	System.out.println(z);	
     
     Integer aa = new Integer(45);
     
     int i = aa.intValue();
     
     System.out.println(i);
     
     int a =55;
     
     Integer bb = Integer.valueOf(a);  // new Integer(a);
     
     
     
     
   
     
		

	}
	
	public static WrapperClass sm(int a)
	{
				
		return new WrapperClass(a);
		
		
	}

}
