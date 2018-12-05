package interview.java.ass.collection;

import java.util.Vector;

public class vectorDemo {

	public static void main(String[] args) {
		
		Vector v=new Vector<>();
		System.out.println("capicity in vector: "+v.capacity());
		for (int i = 0; i <10; i++) {
			v.addElement(i);
		}
		System.out.println("capacity in vector: "+v.capacity());
		v.addElement("Anu");
		System.out.println("capacity in vector: "+v.capacity());
		System.out.println("vectors are:"+v);
		v.size();
		v.removeElement(7);
		System.out.println("capacity in vector: "+v.capacity());
		System.out.println("vectors are:"+v);
		v.removeElement(3);
		System.out.println("capacity in vector: "+v.capacity());
		System.out.println("vectors are:"+v);
		v.lastElement();
		System.out.println("capacity in vector: "+v.capacity());
		System.out.println("vectors are:"+v);
		v.removeAllElements();
		System.out.println("capacity in vector: "+v.capacity());
		System.out.println("vectors are:"+v);
		v.addAll(0,v);
		System.out.println("capacity in vector: "+v.capacity());
		System.out.println("vectors are:"+v);
	}
	
}
