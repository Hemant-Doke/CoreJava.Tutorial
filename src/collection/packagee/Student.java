package collection.packagee;

import java.util.Arrays;
import java.util.Collections;

public class Student{
	int rollNum;
	String name;
	
	
	
	public Student(int a, String str)
	{
	
		rollNum=a;
		name=str;
	}
	
	public void displayeStudentInfo()
	{
		System.out.println("Stdent roll number = "+rollNum);
		System.out.println("Stdent name = "+name);
		
	}

}
