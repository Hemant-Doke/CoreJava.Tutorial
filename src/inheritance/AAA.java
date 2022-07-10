package inheritance;

public class AAA {

	public AAA() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
				
		A aa = new A();			
		A ab = new B();
		A ac = new C();	
		
		B bb = new B();		
		B ba = new A();
		B bc = new C();
		
		C ca = new A();
		C cb = new B();
		C cc = new C();
		
		
		
		

	}

}
