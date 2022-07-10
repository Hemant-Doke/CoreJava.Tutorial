package operators;

public class UnaryOperator {

	public static void main(String[] args) {
		// Unary operator exp++,exp--,++exp,--exp,~,!
		
		int a = 5;//4,3,4
		int b = 7;//6,5
		int z = -67; 
		boolean fl = true;		
		boolean fl2 = !(a<b);
		System.out.println(fl2);
		
		boolean fl1 = !fl;
		System.out.println(fl1);
		
		int i = ~z;  // i = z*-1 -1
		System.out.println(i);
		
		
		int h = a--+b--+--a+b--+a++; // 5+7+3+6+3
		System.out.println(h);
		a=5;
		b = 7;
		int g = ++a-b++-a--+b--;// 6-7-6+8
		
		System.out.println(g);
		
		int f = --b;
		System.out.println(f);
		System.out.println(b);
		
		int e = ++a;
		System.out.println(e);
		System.out.println(a);
		
		int d = b--;
		System.out.println(d);
		System.out.println(b);
		
		
		int c = a++;
		System.out.println(c);
		System.out.println(a);
		   

	}

}
