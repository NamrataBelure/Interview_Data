package interview.java.ass.set;

import java.awt.print.Printable;
import java.util.HashMap;

public class keyHashMap {

	public static void main(String[] args) {
	HashMap<String, Integer>map=new HashMap<>();
	Print(map);
	map.put("anu", 10000);
	map.put("akash",20000);
    map.put("aayush",15000);
    System.out.println("Size of map is:"+map.size());
    Print(map);
    if(map.containsKey("anu")){
    	Integer a=map.get("anu");
    	System.out.println("value for key\"anu\"is:"+a);
    	map.clear();
    	Print(map);
        }
	}

	private static void Print(HashMap<String, Integer> map) {
		if(map.isEmpty()){
			System.out.println("map is empty...");
		}
		else{
			System.out.println(map);
		}
	}

}
