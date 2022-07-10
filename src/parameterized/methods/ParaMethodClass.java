package parameterized.methods;

public class ParaMethodClass {

	public static void main(String[] args) {
		
	ParaMethodClass obj = new ParaMethodClass();
	
	obj.addition(23,23);
	obj.addition(44,56);
	obj.calculateSimpleInterest(100000, 7.5f, 24.0f);
	obj.calculateSimpleInterest(45, 4.4f, 34.9f);
	obj.concateStrings("Hi ", "Hello, how are you?");
	
	ParaMethodClass.concateStrings("PPPP ", "HHGKJGYIU ");
	concateStrings("TRE ", "HHGKJFFF ");
	

	}

	public void addition(int x, int y)
	{
		int a = 90;
		int b = 45;
		int c = x+y;
		sam();
		System.out.println("Addition is = "+ c);
	}
	
	public void sam()
	{
		System.out.println("Sample method");
	}
	
	public void calculateSimpleInterest(int principal, float roi, float tenure)
	{
		float si = (principal*roi*tenure)/100;
		
		System.out.println("Principal Amount = "+principal);
		System.out.println("SI is = "+si);
		System.out.println("Total Amount payable = "+ (principal + si));
		
		float emi = (principal + si)/tenure;
		System.out.println("EMI = "+emi);
		
	}
	
	public static void concateStrings(String str1, String str2)
	{
		String data = str1+str2;
		System.out.println(data);
	}
	
}
