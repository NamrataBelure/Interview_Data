package interview.java.ass.Array;

import java.util.Scanner;

public class MatchingParies {
public static void main(String[] args) {
	
	System.out.println("Enter the Array Elements betwwen 1-10: ");
	Scanner sc=new Scanner(System.in);
	System.out.println("How Many Elements enter in array:");
	int num=sc.nextInt();
	int[]a=new int[num];
	System.out.println("Enter the"+num+"value in array");
	for (int i = 0; i < num; i++) {
		a[i]=sc.nextInt();
	}
	System.out.println("In which pair you want to u...");
	int no=sc.nextInt();
	for (int i = 0; i < a.length; i++) {
		for (int j =i; j < a.length;j++) {
			if (a[i]+a[j]==no) {
				System.out.println("Enter the Number is "+a[i]+":"+a[j]+" matching pair is:"+no);
			}			
		}
		
	}
}
}
