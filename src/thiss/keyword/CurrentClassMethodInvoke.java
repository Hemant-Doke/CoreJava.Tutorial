package thiss.keyword;

public class CurrentClassMethodInvoke {
	int a = 90;
	static int b = 67;

	public CurrentClassMethodInvoke(int a, int b) {
	    this.a = a;
		this.b = b;
		this.SM();
		System.out.println(this.a);
		System.out.println(this.b);

	}

	public CurrentClassMethodInvoke() {
		System.out.println("this is default constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurrentClassMethodInvoke oo = new CurrentClassMethodInvoke(22, 33);
		
		CurrentClassMethodInvoke obj = new CurrentClassMethodInvoke();
		obj.sampleNonStaticMethod();

	}

	public void sampleNonStaticMethod() {
		
		  int a = 99; 
		  int b = 66;
		 
		System.out.println(a);
		System.out.println(b);
		System.out.println(this.a);
		System.out.println(this.b);
		this.SM();
		this.sampleStaticMethod();
	}
  // this keyword can not be used in static method
	public static void sampleStaticMethod() {
		int a = 99;
		int b = 66;
		CurrentClassMethodInvoke oo = new CurrentClassMethodInvoke();
		System.out.println(a);
		System.out.println(b);
		System.out.println(oo.a);
		System.out.println(b);
		//System.out.println(this.a);

	}
	
	public void SM()
	{
		System.out.println("sample method");
	}

	

}
