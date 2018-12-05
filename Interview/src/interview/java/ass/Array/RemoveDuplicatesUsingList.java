package interview.java.ass.Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicatesUsingList {

	public static void main(String[] args) {
    List<String>  arraylist = new ArrayList<String>();
	    
	    arraylist.add("instanceofjava");
	    arraylist.add("IQ");
	    arraylist.add("IP");
	    arraylist.add("java");
	    arraylist.add("CIQ");
	    arraylist.add("instanceofjava");
	    arraylist.add("Java IQ");
	    
	    System.out.println("Before Removing duplicate elements:"+arraylist);
	    HashSet<String> hashset = new HashSet<String>();
	    
	    hashset.addAll(arraylist);
	    arraylist.clear();
	    arraylist.addAll(hashset );
	 
	    System.out.println("After Removing duplicate elements:"+arraylist);


	}

}
