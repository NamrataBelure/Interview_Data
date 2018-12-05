package interview.java.ass.Basics;

import java.util.Scanner;

public class Prime {
public static void main(String[] args) 
	
	{
		int n,i,count=0;
		System.out.println("enter the no.:");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();

		for(i=1;i<=n;i++)
		{
			if(n % i==0)
			{
				count++;
				
			}
		}
		if(count==2)
		{
			System.out.println("prime Number:");
		}
		else
			System.out.println("No.is Not prime Number:");
	}
}
