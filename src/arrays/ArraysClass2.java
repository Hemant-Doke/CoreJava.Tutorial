package arrays;

import java.util.Arrays;

import data.types.*;


public class ArraysClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int arr[] = new int[4];
		int arr1[] = new int[4];
		
		arr[0] = 230;
		arr[1] = 23;
		arr[2] = 2;
		arr[3] = 55;
		
		Arrays.sort(arr);
		
		boolean f = Arrays.equals(arr, arr1);
		System.out.println(f);
		System.out.println(arr1.length);
		

	}

}
