package interview.java.ass.Basics;

import java.util.Scanner;

public class Amstrong {

 public static void main(String[] args) {
		int num,temp,sum=0,i=1,n=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers:");
		num=sc.nextInt();
		i=num;
		int digit=(int)(Math.log10(num)+1);
		while (num>0) {
			 n=num%10;
            sum+=Math.pow(n, digit);
             num=num/10;
		}
		if(sum==i){
			System.out.println("Enter the value is Amstrong:");
		}
		else
			System.out.println("Enter the value is not Amstrong:");

	}

}
