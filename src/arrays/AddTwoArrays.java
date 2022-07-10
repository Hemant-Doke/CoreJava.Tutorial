package arrays;

public class AddTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[][] = {{450,30,444},{526,434,434},{738,345,32},{23,22,223}};

		int arr2[][] = {{45,3,23},{56,44,23},{78,34,2323},{234,567,23}};
		
		int addArr[][] = new int[arr1.length][arr2[2].length];
		
		for (int i=0; i<arr1.length; i++)
		{
			
			for (int j=0; j<arr1[0].length;j++)
			{
				
				addArr[i][j] = arr1[i][j] + arr2[i][j];
				
			}
			
			
		}
		
		
		
		addArr[0][0] = arr1[0][0] + arr2[0][0];
		addArr[0][1] = arr1[0][1] + arr2[0][1];
		
		addArr[1][0] = arr1[1][0] + arr2[1][0];
		addArr[1][1] = arr1[1][1] + arr2[1][1];
		
		addArr[2][0] = arr1[2][0] + arr2[2][0];
		addArr[2][1] = arr1[2][1] + arr2[2][1];
		
		
		
		
		
		
		
		
		
		
	}

}
