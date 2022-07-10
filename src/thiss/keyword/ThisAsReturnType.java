package thiss.keyword;

public class ThisAsReturnType {
	int a =45;
	int b = 77;
	

	public ThisAsReturnType() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ThisAsReturnType obj = new ThisAsReturnType();		
		ThisAsReturnType oo = obj.sampleMethod();
		System.out.println(oo.a);
		System.out.println(oo.b);		

	}
	
	public ThisAsReturnType sampleMethod()
	{
		this.a = 55;
		this.b = 99;
		
		return this;
		
	}
	
	public int sm()
	{
		int a = 88;
		return a;
	}

}
