package collection.packagee;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapClass2 {
	static Integer asd;

	public static void main(String[] args) {

   HashMap<Integer, Student> data = new HashMap<>();
   Student st1 = new Student(2, "Amit");	
	Student st2 = new Student(3, "Amol");
	
	st1.displayeStudentInfo();
	new Student(33, "GGGGG").displayeStudentInfo();
	
	
   data.put(101, st1);
   data.put(2, st2);
   data.put(567, new Student(34, "Sachin"));  
   
   Student sss = data.get(101);
   sss.displayeStudentInfo();
   
   
   for (Entry<Integer, Student> each:data.entrySet())	   
   {
	 Integer key = each.getKey();
	 System.out.println(key);
	Student val = each.getValue();
	System.out.println(val.rollNum);
	System.out.println(each.getValue().name);
	   
   }
   
   
   

	}

}
