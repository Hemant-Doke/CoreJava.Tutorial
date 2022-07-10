package forloop;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char charr[] = {'a','b','t','y','s'};
		
		int arr[] = {23,4,5,78};
		
		String[] strArr = {"Hi", "Hello", "GN"};
		
		for (String each:strArr)
		{
			System.out.println(each);
		}
		
		
		
		for (int each : arr)
		{
			System.out.println("Inside for loop");
			System.out.println(each);
		}
		
		for (char each : charr)
		{
			System.out.println("Inside for loop");
			System.out.println(each);
		}

	}

}
