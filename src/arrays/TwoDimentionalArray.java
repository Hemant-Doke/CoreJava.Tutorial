package arrays;

import java.util.Arrays;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		int arr1[] = {34,2,5,67};
		int a = arr1[2];

		int arr[][] = {{45,3},{56,44,78,89,90},{78,34}};
		
		int arr2[][] = {{45,3},{56,44},{78,34}};
		
		int ap[][][] = {{{45,3},{56,44},{78,34}},{{45,3},{56,44,78,89,90},{78,34}}};
		
		System.out.println(ap[0][1][0]);
		
		System.out.println(arr[0][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[2][0]);	
		
		int[] ab = arr[1];
		Arrays.sort(ab);
		
		boolean f = Arrays.equals(arr[0], arr2[0]);
		System.out.println(f);
		
		int lng = arr.length;
		System.out.println(lng);
		
		int lng1 = arr[1].length;
		System.out.println(lng1);

	}

}
