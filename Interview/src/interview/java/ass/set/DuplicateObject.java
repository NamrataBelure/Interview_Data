package interview.java.ass.set;

import java.util.HashSet;

public class DuplicateObject {

	public static void main(String[] args) {
		HashSet<price>hash=new HashSet<>();
       hash.add(new price("apple", 40));
       hash.add(new price("mango", 30));
       hash.add(new price("chicku",20));
       for (price price : hash) {
		System.out.println(price);
	}
       price duplicate=new price("apple", 40);
       System.out.println("inserting Duplicate value");
       hash.add(duplicate);
       System.out.println("After insertion");
       for (price price : hash) {
		System.out.println(price);
	}
	}

}
