package string;

public class StringClass2 {

	public static void main(String[] args) {
		// charAt(), length(),endsWith(" "),startsWith(),replace(),trim(),split(" "),subString(),contains(),equals(),
				//concate(),equalsIgnoreCase(String another),toLowerCase(),toUpperCase()
		String data = "showing 5 of 450 results";
		String str3 = new String("Welcome to KTCTC DE21");
		String str1 = "Welcome to KTCTC DE21";
		String temp = "KTCTC"; 
		String str2 = "    Welcome     to KTCTC                 DE21    ";
		
		String dd7 = str1.toUpperCase();		
		System.out.println(dd7);
		
		String dd6 = str1.toLowerCase();
		System.out.println(dd6);
		
		boolean f5 = str1.equalsIgnoreCase("Welcome to ktctc DE21");		
		System.out.println(f5);
		
		String dd5 = str1.concat(" Test concate");
		System.out.println(dd5);

		
		boolean f4 = str1.equals(str3);
		System.out.println(f4);
		
		boolean f3 = str1.contains(" to ");
		System.out.println(f3);
		
		// below logic is to get total count from string
		String ar1[] = data.split(" of ");	
		String tt = ar1[1];
		String ar2[] = tt.split(" ");
		System.out.println(ar2[0]);		
		
		String dd4 = str1.substring(2,4);
		System.out.println(dd4);
		
		String dd3 = str1.substring(7);
		
		System.out.println(dd3);
		
		String[] arr1 = str2.split(" "); 
		
		String[] arr = str1.split("KT");
		System.out.println(arr);
		
		
		String dd2 = str2.trim();
		System.out.println(dd2);
		
		String dd1 = str1.replace("\\s+", " ");
		System.out.println(dd1);		
		
		String dd = str1.replace('o', 'A');
		System.out.println(dd);
		
		boolean f2 = str1.startsWith("Welcome ");
		System.out.println(f2);
		
		boolean f1 = str1.endsWith("KTCTC DE21");
		System.out.println(f1);
		
		int lng = str1.length();
		System.out.println(lng);
		
		char ch = str1.charAt(3);
		
		System.out.println(ch);
		
		for (int i=0;i<str1.length();i++)
		{
			System.out.println(str1.charAt(i));
		}
		
		for (int i=str1.length()-1;i>=0;i--)
		{
			System.out.print(str1.charAt(i));
		}		
		
		
		
		

	}

}
