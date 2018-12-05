package interview.java.ass.reverseStringWords;

import java.util.Scanner;

public class CircularString {

	public static void main(String[] args) {
	int l=4;
	String p="";
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String:");
	String input=sc.nextLine();
	String circular=input+input.substring(0,l-1);
	
	for (int i = 0; i < input.length(); i++) {
		p=circular.substring(i, i+l);	
		 System.out.println("circular string is:"+p);
		}
   
	}

}
