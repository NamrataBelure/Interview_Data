package interview.java.ass.set;

import java.util.HashSet;
import java.util.Set;

public class setToArray {

	public static void main(String[] args) {
	Set set=new HashSet();
	set.add("pune");
	set.add("mumbai");
	set.add("solapur");
	System.out.println("Enter the string for set:"+set);
	
	String[] arrayString=(String[]) set.toArray(new String[set.size()]);
    for (String s : arrayString) {
		System.out.println("Enter the string for Array: "+s);
		
	}
	}

}
