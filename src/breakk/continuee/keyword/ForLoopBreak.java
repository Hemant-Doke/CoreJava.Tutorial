package breakk.continuee.keyword;

public class ForLoopBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char charr[] = {'o','v','f','a','r','t','u'};
		
		for (int i=0; i<charr.length;i++)
		{
			if (charr[i]=='a' ||charr[i]=='e' ||charr[i]=='i' ||charr[i]=='o' ||charr[i]=='u')
			{
				System.out.println("Given array has vovel");				
				break;
			}
		}
		
		
		
		for (int i = 0; i<5; i++)
		{
			System.out.println("Inside for loop");
			if (i==3)
			{
			break;
			}
		}

	}

}
