package interview.java.ass.sorting;

import java.util.Scanner;
public class withoutsorting {
public static void main(String[] args) {
	int arr[]={14,45,48,75,98,51};
	int largest=arr[0];
	int secondlar=arr[0];
	System.out.println("Enter the given array:");
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]+"\t");
	}
	for (int i = 0; i < arr.length; i++) {
		if (arr[i]>largest) {
			secondlar=largest;
			largest=arr[i];
		}
		else
			if (arr[i]>secondlar) {
				secondlar=arr[i];
			}
	}
	System.out.println("largest number is:"+largest);
	System.out.println(" second largest number is :"+secondlar);
}
}
