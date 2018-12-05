package interview.java.ass.sortingstudent;

import java.util.ArrayList;
import java.util.Collections;

public class MainTest {

	public static void main(String[] args) {
		ArrayList<Employee>alist=new ArrayList<>();
		alist.add(new Employee(01,"anu","solapur"));
		alist.add(new Employee(04,"harsh","pune"));
		alist.add(new Employee(03,"akash","mumbai"));
        alist.add(new Employee(02,"taher","pune"));
        
        System.out.println("unsorted list:");
        for (int i = 0; i < alist.size(); i++) {
			System.out.println(alist.get(i));
		}
         Collections.sort(alist,new SortByEmployeeId());
         System.out.println("\n Sorted By IdWise:");
         for (int i = 0; i < alist.size(); i++) {
			System.out.println(alist.get(i));
		 }
      
        Collections.sort(alist,new SortByName());
        System.out.println("\n Sorted By NameWise:");
        for (int i = 0; i < alist.size(); i++) {
			System.out.println(alist.get(i));
		}
	}
}
