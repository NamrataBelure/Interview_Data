package interview.java.ass.Basics;

import java.util.ArrayList;
import java.util.Collections;

public class SwapUsingArrayList {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("Anu");
		al.add("akash");
		al.add("aayush");
		al.add("aslam");
		al.add("asadh");
		System.out.println("before swapping elements:");
        for (String temp : al) {
		System.out.println(temp);
        }
	    Collections.swap(al, 1, 4);
	    
	    System.out.println("after swapping Elements:");
	    for (String temp1 : al) {
			System.out.println(temp1);
		}    
    }
}
