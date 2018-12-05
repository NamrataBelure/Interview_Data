package ArrayListImpl;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class AvoidConcurrentException {

	public static void main(String[] args) {
	List<String>list= new CopyOnWriteArrayList<String>();
	list.add("1");
	list.add("2");
	list.add("3");
	list.add("4");
	list.add("5");
	Iterator<String>itr=list.iterator();
	while (itr.hasNext()) {
		String value = (String) itr.next();
		System.out.println("values:"+value);
	    if (value.equals("3")) {
			list.remove("4");
			list.add("6");
			list.add("7");
		}
	}
	System.out.println("List size:"+list.size());
	
	Map<String, String>map=new ConcurrentHashMap<>();
	map.put("01","x1");
	map.put("02","x2");
	map.put("03","x3");
	Iterator<String>itrmap=map.keySet().iterator();
	while (itrmap.hasNext()) {
		String key= (String) itrmap.next();
		System.out.println("map value :" +map.get(key));
		if (key.equals("01")) {
			map.remove("03");
			map.put("04","x4");
            map.put("05","x5");
		}
	}
	System.out.println("map size :"+ map.size());
}

}
