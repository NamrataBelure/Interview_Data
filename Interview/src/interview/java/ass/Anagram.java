package interview.java.ass;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static boolean isAnagram(String s1,String s2){

		char[]w1=s1.replaceAll("[\\s]","").toCharArray();
		char[]w2=s1.replaceAll("[\\s]","").toCharArray();
		Arrays.sort(w1);
		Arrays.sort(w2);
		
		return Arrays.equals(w1,w2) ;
		
	}
	public static void main(String[] args) {
	String s1,s2;
	boolean check;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter First String:");
	s1=sc.nextLine();
	System.out.println("Enter Second String:");
	s2=sc.nextLine();
	if (isAnagram(s1, s2)){
		System.out.println("'"+s1+"'And'"+s2+"'are Anagrams.'");
	     }
		else {
		 System.out.println("'"+s1+"'And'"+s2+"'not are Anagrams.'");
		}
	}
}
	
