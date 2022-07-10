package thiss.keyword;

public class ThisAsArgumentInConstructor {
	int a = 99;

	public ThisAsArgumentInConstructor() {
		System.out.println(this.a);
		AA objAA = new AA(this);
		System.out.println(this.a);
	}

	public ThisAsArgumentInConstructor(ThisAsArgumentInConstructor oo) {
		oo.a = 78;
		this.a = 444;

	}

	public ThisAsArgumentInConstructor(int a) {
		
	}

	public static void main(String[] args) {

		ThisAsArgumentInConstructor obj = new ThisAsArgumentInConstructor();
		System.out.println(obj.a);
		obj.sampleNonStaticMethod();

	}

	public void sampleNonStaticMethod() {

		ThisAsArgumentInConstructor objMethod = new ThisAsArgumentInConstructor(this);
		System.out.println(objMethod.a);
		System.out.println(this.a);

	}

}
