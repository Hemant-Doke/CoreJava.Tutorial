package collection.packagee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListClass {

	public static void main(String[] args) {		

		ArrayList<Integer> data = new ArrayList<>();

		Integer a = new Integer(23);
		Integer b = new Integer(33);
		data.add(null);
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
		data.add(null);
		data.add(null);
		data.add(null);
		data.add(null);
		//data.add(0, 555);
		//data.set(0, 7777);// updated the data
		
		Integer z = data.get(2);
		
		int lng = data.size();
		System.out.println(lng);
		
		System.out.println(z);
		
		System.out.println(data);
		
		//Collections.sort(data);
		System.out.println(data);
		
		Iterator<Integer> itr = data.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
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
