package collection.packagee;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapClass {
	static Integer asd;

	public static void main(String[] args) {

   HashMap<Integer, String> data = new HashMap<>();
   Integer a = new Integer(6);
   data.put(101, "Amit");
   data.put(2, "Amol");
   data.put(30, "Salman");
   data.put(a, "GTRF");
   data.put(2, "Sanket");
   data.put(4, "Amit");
   data.put(null, "fwefwefew");
   data.put(45, null);
   data.put(38,	null);
   data.put(null, "rtt");   
   data.put(asd, "asdasd");
   
   System.out.println(data);
   System.out.println(data.size());
   
   String str = data.get(45);
   System.out.println(str);
   System.out.println(data.get(30));
   
   data.remove(null);
   System.out.println(data);
   
   for (Entry<Integer, String> each:data.entrySet())	   
   {
	 Integer key = each.getKey();
	 System.out.println(key);
	String val = each.getValue();
	System.out.println(val);
	   
   }
   
   
   

	}

}
