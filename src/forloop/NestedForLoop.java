package forloop;

public class NestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		outer : for (int i = 0; i<2;i++)
		{
			System.out.println("Outer for loop for i = "+i);
			
			inner : for (int j = 0; j<2; j++)
			{
				System.out.println("Inner for loop for j = "+j);
				
				
			}
			
			
		}

	}

}
