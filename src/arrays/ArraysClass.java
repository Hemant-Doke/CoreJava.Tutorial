package arrays;

import java.util.Arrays;

import data.types.*;


public class ArraysClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		int a =89;
		int b = 89;
		boolean f4 = a==b;
		System.out.println(f4);
		
		ArraysClass oo = new ArraysClass();
		ArraysClass oo1 = oo;
		
		int arr[] = {34,2,5,67};
		int arr1[] = {34,2,5,67};
		int arr2[] = arr;
		
		int lng = arr.length;
		System.out.println(lng);
		
		Arrays.sort(arr1);
		
		
		boolean f5 = Arrays.equals(arr, arr1);
		System.out.println(f5);
		
		boolean f3 = arr[1] == arr1[1];
		System.out.println(f3);
		
		boolean f = arr==arr1;
		System.out.println(f);
		
		
		boolean f2 = arr==arr2;
		System.out.println(f2);
		
		
		System.out.println(arr[5]);
		arr[4] = 90;
				
		arr[1] = 44;
		arr[2] = a;
		
		a = arr[3];
		int z = arr[2];
		System.out.println(z);
		System.out.println(arr[0]);
		
		System.out.println(a);
		System.out.println(oo);
		System.out.println(arr);
		

	}

}
