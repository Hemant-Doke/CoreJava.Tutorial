package collection.packagee;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetClass {

	public static void main(String[] args) {
LinkedHashSet<Integer> dd = new LinkedHashSet<>();		
		Integer a = new Integer(444);
		dd.add(new Integer(30));
		dd.add(34);
		dd.add(a);
		dd.add(56);
		dd.add(88);
		dd.add(new Integer(560));
		dd.add(34);
		System.out.println(dd);
		dd.remove(a);
		dd.add(null);
		dd.add(null);
		System.out.println(dd.size());		
		for (Integer each:dd)
		{
			System.out.println(each);
		}

	}

}
