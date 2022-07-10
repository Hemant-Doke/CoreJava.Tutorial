package breakk.continuee.keyword;

public class ContinueForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for (int i = 0; i<5; i++)
		{
			System.out.println("Hello");			
			System.out.println("Hi");
			continue;
			
			
		}
		
		
		for (int i = 0; i<5; i++)
		{
			System.out.println("Hello");
			
			if (i==2)
			{
				continue;
			}
			System.out.println("Hi");
			
		}

	}

}
