package collection.packagee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListClass4 {

	public static void main(String[] args) {			

		List<Object> data = new ArrayList<>();
		
		Student st1 = new Student(2, "Amit");
		
		Student st2 = new Student(3, "Amol");
		
		String str = new String("KTCTC");
		
		data.add(st2);
		data.add(st1);
		data.add(str);
		data.add('D');// new Character('D')
		data.add(new Integer(55));
		
		Object ss = data.get(1);
		
		Student ss1 = (Student)ss;
		
		Object itrr = data.get(4);
		
		Integer ii = (Integer)itrr;
		
		
		float fl  = 89.45f;
		
		int it = (int)fl;
		System.out.println(it);
		
		for (Object each:data)
		{
			System.out.println(each);
		}
		
		
		
	
		
	}
	
	
	

}
