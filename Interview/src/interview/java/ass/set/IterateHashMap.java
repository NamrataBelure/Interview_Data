package interview.java.ass.set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IterateHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String>map=new HashMap<Integer,String>();
		map.put(11,"anu");
		map.put(22,"sonu");
		map.put(33,"pilu");
		map.put(44,"piuuu");
		map.put(55,"aayush");
   
		Set entryset=map.entrySet();
		Iterator it= entryset.iterator();
		
		
		System.out.println("Hashmap key-value pairs:");
		while (it.hasNext()) {
	   Map.Entry me=(Map.Entry)it.next();
	   System.out.println("key is : "+me.getKey()+" & "+" value is : "+me.getValue());
		}
      }
	}
