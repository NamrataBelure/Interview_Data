package hashcodeandEquals;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MainTEst {

	public static void main(String[] args) {
	   employee e1=new employee("Deepali",02,25000);
	   employee e2=new employee("Anu", 01, 18000);
	   employee e3=new employee("Anju", 03,20000);
	   employee e4=new employee("Aasd",04,35000);
	   employee e5=new employee("Aasd",04,35000);
	   employee e6=new employee("Anu", 01, 18000);
	   
	   LinkedHashMap<employee, String>hash=new LinkedHashMap<>();
		hash.put(e1, "v1");
		hash.put(e2, "v2");
		hash.put(e3, "v3");
		hash.put(e4, "v4");
		hash.put(e5, "v5");
		hash.put(e6, "v6");

		System.out.println(hash);
	}

}
