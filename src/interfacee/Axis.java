package interfacee;

public class Axis implements RBI{

	public  void homeLoanInterestRate()
	{
		System.out.println("Axis Home loan interest rate 9.1");
	}
	
	public void carLoanInterestRate()
	{
		System.out.println("Axis car loan interest rate 9.4");
	}
	
	public void personalLoan()
	{
		System.out.println("Axis personal loan interest rate 9.9");
	}
	
	
	public static void main(String[] args) {
		
		Axis ax = new Axis();
		
		
	
		
		
		
	}

	@Override
	public void currancyConverter() {
		
		System.out.println("Axis currancy converter rate 9.9");
	}

	@Override
	public void duplicateMethod() {
		// TODO Auto-generated method stub
		
	}

}
