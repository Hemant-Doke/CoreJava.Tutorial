package returns.type;

public class ReturnTypesClass2 {
	
	int a = 90;
	static int b = 67;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[] = {23,45,67};
		int ar2[] = {22,55,66};
		ReturnTypesClass2 obj = new ReturnTypesClass2();
		String str = obj.getConcatedString("ABCD ", "PQRS 123");
		System.out.println(str);
		
		int[] reArray = obj.getAdditionOfProvidedArray(ar, ar2);
          
		for (int e:reArray)
		{
			System.out.println(e);
		}

		Student oo = getStudentInstance();
		oo.displayStudentInfo();
		

	}
	
	public String getConcatedString(String str1, String str2)	
	{
		String data = str1+str2;
		
		return data;
	}
	
	public int[] getAdditionOfProvidedArray(int arr1[], int arr2[])
	{
		int arradd[] = new int[arr1.length];
		
		for (int i=0; i<arradd.length; i++)
		{
			arradd[i] = arr1[i] + arr2[i];
		}
		
		return arradd;		
		
	}
	
	public static Student getStudentInstance()
	{
		Student obj = new Student();
		obj.rollNum = 55;
		obj.name = "Salman";
		
		return obj;
	}
	
	
	
}
