package interfacee;

public class SBIFinance extends SBI{

	
	public void twoWheelerLoan()
	{
		System.out.println("SBIFinance 2 wheer loan rate is 3.2");
	}
	
	
	public static void main(String[] args) {
		
		
		RBI oo = new SBIFinance();
		oo.carLoanInterestRate();
	}
	

}
