package interview.java.ass.Array;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
     int i=0,j=0;
     int num[]=new int[100];
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter how many Array u want:");
     int count=sc.nextInt();
     for (i= 0;i<count; i++) {
		System.out.println("Enter Array Elements"+(i+1)+":");
		num[i]=sc.nextInt();
	}
   j=i-1;
   i=0;
   sc.close();
   while(i<j)
	{
	   num[i]=num[i]+num[j];
	   num[j]=num[i]-num[j];
	   num[i]=num[i]-num[j];
	   i++;
	   j--;
	}

	System.out.print("Reversed array: ");
	for(i=0; i<count; i++)
	{
	   System.out.print(num[i]+ "  ");
	}       
  }
}
