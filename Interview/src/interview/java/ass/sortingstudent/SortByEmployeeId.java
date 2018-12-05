package interview.java.ass.sortingstudent;

import java.util.Comparator;

public class SortByEmployeeId implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.eId-o2.eId;
	}

}
