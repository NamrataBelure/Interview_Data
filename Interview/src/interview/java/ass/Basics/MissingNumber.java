package interview.java.ass.Basics;

import java.util.Arrays;
import java.util.BitSet;

public class MissingNumber {
	public static void main(String[] args) {
		MissingNumber(new int[]{1,2,3,4,6},6);
        MissingNumber(new int[]{1,3,4,6,8,9},10);	
        MissingNumber(new int[]{2,5,6,8,9,12,13,19},20);
       
}
public static void MissingNumber(int[] numbers,int count){
	int MissingCount=count-numbers.length;
    BitSet bitset=new BitSet(count);
      for (int i : numbers) {
	  bitset.set(i-1);
      }
	System.out.printf("Missing Number integer array %s,with total number %d is %n",Arrays.toString(numbers),count );	
	int lastMissingIndex=0;
	 
	
	for (int j = 0; j < MissingCount; j++) {
		lastMissingIndex=bitset.nextClearBit(lastMissingIndex);
		System.out.println(++lastMissingIndex);
      }
 }
public static int getMissingNumber(int[]numbers,int totalCount){
	int exceptedSum=totalCount*((totalCount+1)/2);
	int actualCount=0;
	for (int i : numbers) {
		actualCount+=i;
		
	 }
	return exceptedSum-actualCount;
	}
}

