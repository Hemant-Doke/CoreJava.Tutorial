package thiss.keyword;

public class CurrentClassInstanceVariable {
	int a = 90;
	static int b = 67;

	public CurrentClassInstanceVariable(int a, int b) {
		this.a = a;
		this.b = b;

	}

	public CurrentClassInstanceVariable() {
		System.out.println("this is default constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurrentClassInstanceVariable.sampleStaticMethod();

		CurrentClassInstanceVariable obj = new CurrentClassInstanceVariable();
		obj.a = 44;
		obj.sampleNonStaticMethod();
		CurrentClassInstanceVariable oo = new CurrentClassInstanceVariable(23, 34);

	}

	public void sampleNonStaticMethod() {
		
		  int a = 99; 
		  int b = 66;
		
		 System.out.println(this.a);
		System.out.println(a);
		System.out.println(b);
		System.out.println(this.a);
		System.out.println(this.b);
	}
  // this keyword can not be used in static method
	public static void sampleStaticMethod() {
		int a = 99;
		int b = 66;
		CurrentClassInstanceVariable oo = new CurrentClassInstanceVariable();
		System.out.println(a);
		System.out.println(b);
		System.out.println(oo.a);
		System.out.println(b);
		System.out.println(this.a);

	}

	

}
