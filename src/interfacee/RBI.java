package interfacee;

public interface RBI extends WorldBank{

	public static final int ABC = 45;
	int PQR = 90;
	
	public abstract void homeLoanInterestRate();	
	public void carLoanInterestRate();
	public void duplicateMethod();
	
	public static void staticMethodFromInterFaceWithBody()
	{
		System.out.println("static Method From InterFace With Body");
	}
	
	public default void defaultMethodFromInterface()
	{
		System.out.println("default Method From Interface");
	}
	
	
		
}
