package operators;

public class TernaryOperator {

	public static void main(String[] args) {
		// Ternery Operators (if-then-else)  ? :
		
		int b = 89;
		int c = 33;
		int age = 18;
		
		boolean flag = false;
		
		
		char cc = flag?'Y':'N';
		System.out.println(cc);
		
		String data = age>=18?"You can vote": "You can not vote";
		System.out.println(data);
		
		int a = flag? 23:45;
		System.out.println(a);
		
		int d = b>c && flag ?44:55;
		System.out.println(d);
		  

	}

}
