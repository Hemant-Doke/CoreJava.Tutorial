package whilee.loop;

public class WhileLoopClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 90;
		int b = 90;
		
		int arr[] = {33,56,78,56};
		
		if (true)
		{
			System.out.println("dfgdfgdfg dfg");
		}
		
		
		
		int i = 0;
		while(i<arr.length)
			{
			    System.out.println(arr[i]);
			    i++;
			}
		
		
		
		while(a<100)
		{
			System.out.println("Inside while loop");
			System.out.println(a);
			
			a+=2; // a = a+2
			
		}
		
		for (;b<100;)
		{
			System.out.println("Inside for loop");
			System.out.println(b);
			
			b+=2; // a = a+2
		}
		
		while(true)
		{
			System.out.println("inside while");
		}
	

	}

}
