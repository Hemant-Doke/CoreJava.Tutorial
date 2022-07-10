package abstractt;

public class ConcrateClass extends AbstractClass{	
		
	public ConcrateClass()
	{
		super(23);
		System.out.println("This is child class constructor");
	}
	
	
	public static void main(String[] args) {
		
		ABClass oc = new ConcrateClass();
		oc.sampleAbstractMethodFromInterface(23);
		oc.smAbstractMethodFromABClass();
	}

	@Override
	public void sampleAbstractMethod() {
		System.out.println("sample abstract method implemented by child class");
		
	}
	
	public void addition()
	{
		int c = 34+34;
		
		System.out.println(c);
	}


	@Override
	public void smAbstractMethodFromABClass() {
		
		System.out.println("sm Abstract Method From ABClass");
		
	}


	@Override
	public void sampleAbstractMethodFromInterface(int a) {
	
		System.out.println("sample Abstract Method From Interface Concrate class");
		
	}

}
