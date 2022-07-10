package collection.packagee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListClass3 {

	public static void main(String[] args) {		

		List<Student> data = new ArrayList<>();
		
		Student st1 = new Student(2, "Amit");
		
		Student st2 = new Student(3, "Amol");
		
		data.add(st2);
		data.add(st1);
		data.add(new Student(5, "Sanket"));		
		Student ss = data.get(0);
		ss.displayeStudentInfo();		
		System.out.println(data);		
		Iterator<Student> itr = data.iterator();
		
		while(itr.hasNext())
		{
			Student temp = itr.next();
			System.out.println(temp.name);
		}
		
	}

	

}
