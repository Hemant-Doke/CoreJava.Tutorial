package thiss.keyword;

public class ThisAsArgumentInMethod {
	
	int a=26;
	int b=89;

	public ThisAsArgumentInMethod() {
		
		smMethod(this);
		
	}

	public static void main(String[] args) {
		
		ThisAsArgumentInMethod obj = new ThisAsArgumentInMethod();
		obj.a = 66;
		obj.b = 88;
		
		obj.sampleNonStaticMethod();

	}
	
	public void sampleNonStaticMethod()
	{
		this.smMethod(this);
	}
	public void smMethod(ThisAsArgumentInMethod oo)
	{
		System.out.println(oo.a);
		System.out.println(oo.b);
	}

}
