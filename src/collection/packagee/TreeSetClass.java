package collection.packagee;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetClass {

	public static void main(String[] args) {
		TreeSet<Integer> dd = new TreeSet<>();		
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
		System.out.println(dd.size());		
		for (Integer each:dd)
		{
			System.out.println(each);
		}
	}

}
