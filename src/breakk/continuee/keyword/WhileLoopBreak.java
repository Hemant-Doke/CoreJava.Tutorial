package breakk.continuee.keyword;

public class WhileLoopBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 90;
		int b = 60;
		
		
		
		do
		{
			System.out.println("Inside do while loop");
			System.out.println(b);
			b--;
			if (b==55)
			{
				break;
			}
			
		}while (b>50);
		
		
		
		
		
		while(a<100)
		{
			System.out.println("Inside whiler loop");
			System.out.println(a);
			
			a+=2;
			if (a==96)
			{
				break;
			}
			
		}

	}

}
