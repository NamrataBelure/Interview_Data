package interview.java.ass.Basics;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		int x;
		System.out.println("enter a interger:");
		Scanner sc= new Scanner(System.in);
		x=sc.nextInt();
		
		if(x%2==0){
			System.out.println("Number is even:");
		}
		else{
			System.out.println("Number is odd:");
		}

	}
}
