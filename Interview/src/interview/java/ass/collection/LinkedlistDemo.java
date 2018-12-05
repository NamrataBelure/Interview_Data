package interview.java.ass.collection;

import java.util.LinkedList;

public class LinkedlistDemo {
 
	public static void main(String[] args) {
		LinkedList l=new LinkedList<>();
		l.add("anu");
		l.add(23);
		l.add(null);
		l.add("chintu");
		l.set(3,"asad");
		l.add(1,"anay");
		l.remove(2);
		l.addFirst(23);
		l.addLast(17);
		System.out.println("list are:"+l);
	}
}
