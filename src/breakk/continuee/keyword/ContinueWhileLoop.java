package breakk.continuee.keyword;

public class ContinueWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 90;
		int b = 60;
		
		
		do
		{
		
			b--;
			if (b==55)
			{
				continue;
			}
			System.out.println("Inside do while loop");
			System.out.println(b);
			
		}while (b>50);		
		
		
		while(a<100)
		{
			
			a+=2;
			if (a==96)
			{
				continue;
			}
			System.out.println("Inside whiler loop");
			System.out.println(a);
			
			
		}

		

	}

}
