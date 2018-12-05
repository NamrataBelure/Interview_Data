package ArrayListImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class ConversationHashMapToArrayList {

	public static void main(String[] args) {
	HashMap<String, String>StudentPerformances=new HashMap<>();
	StudentPerformances.put("Akash","avg");
	StudentPerformances.put("Harsh","very good");
	StudentPerformances.put("Anu", "good");
	StudentPerformances.put("Amar","Very bad");
	StudentPerformances.put("Sam", "Bad");
	
	Set<String>keyset=StudentPerformances.keySet();
	ArrayList<String>listofKey= new ArrayList<String>(keyset);
	System.out.println("ArrayList of keys : ");
	for (String key : listofKey) {
		System.out.println(key);
	}
	System.out.println("-------------------");
	Collection<String>values=StudentPerformances.values();
	ArrayList<String>listOfValues=new ArrayList<String>(values);
	System.out.println("ArrayList of Values: ");
	for (String value : listOfValues) {
		System.out.println(value);
	}
	System.out.println("--------------------");
	Set<Entry<String, String>>entryset=StudentPerformances.entrySet();
	ArrayList<Entry<String, String>>listOfKeyValue=new ArrayList<Entry<String,String>>(entryset);
	System.out.println("ArrayList Of Key and values: ");
	for (Entry<String, String> entry : listOfKeyValue) {
		System.out.println(entry.getKey()+":"+entry.getValue());
	}
  }
}
