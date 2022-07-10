package abstractt;

public abstract class AbstractClass extends ABClass{
	 int abc = 78;
	static int bcd = 34;
	public final static int PQRS = 45;

	/*
	 * public AbstractClass() { System.out.println("Default AbstractClass"); }
	 */

	
	  public AbstractClass(int a) 
	  { 
		  System.out.println("Parameterized constructor");
		  abc = a;
		  }
	 

	public abstract void sampleAbstractMethod();

	public void sampleNonstaticMethod() {
		System.out.println("sample Nonstatic Method");
	}

	public static void sampleStaticMethod() {
		System.out.println("sample Static Method");
	}

	public static void main(String[] args) {
		
		

		ConcrateClass oo = new ConcrateClass();
		
		AbstractClass obj = new ConcrateClass();
		

		obj.sampleAbstractMethod();

	}
	
	@Override
	public void sampleAbstractMethodFromInterface(int a) {
	
		System.out.println("sample Abstract Method From Interface Abstract class");
		
	}

}
