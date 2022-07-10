package exception;

public class UncheckedException {
	static Sample obj;
	
	static int a = 90;

	public static void main(String[] args) {
		
		int arr[] = {23,45,67,78,34};
		
		String str ="1234trf";
	
		int a=56;
		int b =0;
		
		String data = null;
		
		System.out.println(arr[70]);
		
		System.out.println(str.charAt(56));
		
		int z = Integer.parseInt(str);
		System.out.println(z);
		
		
		obj.sampleMethod();
		
		System.out.println(data.toLowerCase());
		
		int c = a/b;
		
		System.out.println(c);
		
		System.out.println("After exception");
		

	}

}
