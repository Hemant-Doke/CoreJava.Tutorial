package collection.packagee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListClass {

	public static void main(String[] args) {
  List<Integer> data = new LinkedList<>();	
		Integer a = new Integer(23);
		Integer b = new Integer(33);
		data.add(a);
		data.add(b);
		data.add(new Integer(12));
		data.add(22);
		data.add(78);		
		data.remove(1);	
		data.add(34);
		data.remove(a);
		data.remove(a);
		data.add(77);
		data.add(34);		
		data.add(34);
		data.add(0, 555);
		data.set(0, 7777);// updated the data
		
		Integer z = data.get(2);
		
		int lng = data.size();
		System.out.println(lng);
		
		System.out.println(z);
		
		System.out.println(data);
		
		Collections.sort(data);
		System.out.println(data);
		
		for (int i=0; i<data.size();i++)
		{
			System.out.println(data.get(i));
		}
		
		for (Integer each:data)
		{
			System.out.println(each);
		}
		

	}

}
