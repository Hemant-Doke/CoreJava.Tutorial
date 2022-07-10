package interfacee;

public class SBI implements RBI, BRICKS{

	int sbiVary = 78;

	@Override
	public void carLoanInterestRate() {
		
		System.out.println("SBI car loan interest rate 7.1");
		
	}

	@Override
	public void homeLoanInterestRate() {
		System.out.println("SBI home loan interest rate 7.5");
		
	}
	
	public void goldLoan()
	{
		System.out.println("SBI gold loan interest rate 8");
	}
	
	

   public static void main(String[] args) {
	   
	   RBI.staticMethodFromInterFaceWithBody();
	   
	   // SBI class can not call static method from parent interface. But, it is possible in case of classes
	  SBI.staticMethodFromInterFaceWithBody();
	   
	   SBI.defaultMethodFromInterface();
	   int a = 56;
	   RBI oo = new SBI();
	  // oo.PQR = 809;
	   oo.defaultMethodFromInterface();
	   
	   System.out.println(oo.ABC);
	   
	   oo.carLoanInterestRate();
	   oo.homeLoanInterestRate();
	   
	   
	
	   SBI obj = new SBI();
	   obj.PQR = 67;
	   obj.ABC = 3434;
	   obj.defaultMethodFromInterface();
	   System.out.println(obj.ABC);		  
	   System.out.println(obj.PQR);	   
	   obj.carLoanInterestRate();
	   obj.homeLoanInterestRate();
	   obj.goldLoan();
	   
	   
	   
}

@Override
public void currancyConverter() {
	System.out.println("SBi currancy converter rate 0.01");
	
}

@Override
public void donationAmount() {
	System.out.println("SBI donation amount 456464646");
	
}

@Override
public void duplicateMethod() {
	System.out.println("SBI has provided implementation of duplicate method");
	
}




}
