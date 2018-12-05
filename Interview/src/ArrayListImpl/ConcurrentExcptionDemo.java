package ArrayListImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ConcurrentExcptionDemo {

	public static void main(String[] args) {
	List<String>list=new ArrayList<>();
	list.add("1");
	list.add("2");
	list.add("3");
	list.add("4");
	list.add("5");
	Iterator<String>itr=list.iterator();
	while(itr.hasNext()){
		String value=itr.next();
		System.out.println("list value:"+value);
		if (value.equals("3"))
        list.remove(value);			
	}
    Map<String,String>map=new HashMap<String, String>();
    map.put("01","abc");
    map.put("02","rst");
    map.put("03","sam");
    Iterator<String>itrmap=map.keySet().iterator();
    while (itrmap.hasNext()) {
		String key = (String) itrmap.next();
		System.out.println("Map value:"+map.get(key));
		if (key.equals("2")) {
			map.put("01", "04");
			map.put("04","asl");
	  }
	}
   }
}
