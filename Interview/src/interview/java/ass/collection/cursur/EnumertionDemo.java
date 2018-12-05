package interview.java.ass.collection.cursur;

import java.util.Enumeration;
import java.util.Vector;

public class EnumertionDemo {
 
	public static void main(String[] args) {
		Vector v=new Vector<>();
		for (int i = 0; i <=10; i++) {
			v.addElement(i);
		}
		System.out.println("values are: "+v);
		Enumeration e=v.elements();
		while (e.hasMoreElements()) {
			Integer i = (Integer) e.nextElement();
			if (i%2==0) {
				System.out.println("Enumerations are:"+i);
			}
		  }
		System.out.println("values are :"+v);
		}
}
