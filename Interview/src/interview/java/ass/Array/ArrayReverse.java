package interview.java.ass.Array;

import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {
		
	    
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter how many Array u want:");
	     int count=sc.nextInt();
	     int num[]=new int[count];
	     for (int i= 0;i<count; i++) {
			num[i]=sc.nextInt();
	     }
        for (int j= count-1; j >=0; j--) {
	    System.out.println("reverse Array is"+num[j]);
       }
	 
	}
}
