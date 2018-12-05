package interview.java.ass.Basics;

import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
    int i=0,sum=0;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter how many number of sum u want to u:");
     int n=sc.nextInt();
     int a[]=new int[n];
     System.out.println("Enter the"+n+"numbers:");
     while (i<n) {
		System.out.println("Enter the"+(i+1)+":");
		a[i]=sc.nextInt();
		sum+=a[i];
		i++;	
	}
     System.out.println("sum is:"+sum);
	}

}
