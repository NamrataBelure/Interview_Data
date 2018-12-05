package interview.java.ass.Basics;

import java.util.Scanner;

public class Swapping {
	public static void main(String[] args) {
		int a,b;
		System.out.println("enter the values...");
		Scanner sc=new Scanner(System.in);
	
	
		a=sc.nextInt();
		b=sc.nextInt();
		
		System.out.println("before swapping...a="+a+" b="+b);

		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swapping...a="+a+" b="+b);
	}
}
