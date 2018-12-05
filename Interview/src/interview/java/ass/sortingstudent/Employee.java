package interview.java.ass.sortingstudent;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Employee {
	int eId;
	String name;
	String adderess;
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", name=" + name + ", adderess=" + adderess + "]";
	}
	/**
	 * @param eId
	 * @param name
	 * @param adderess
	 */
	public Employee(int eId, String name, String adderess) {
		super();
		this.eId = eId;
		this.name = name;
		this.adderess = adderess;
	}
	
	
}
