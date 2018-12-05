package interview.java.ass.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Synchronized {

	public List synchronisedList(List l) {
		return l;
	}

   public static void main(String[] args) {
	
	   ArrayList l=new ArrayList<>();
	   List l1=Collections.synchronizedList(l);
	   System.out.println(l1);
	   System.out.println(l);
	   
   }
}
