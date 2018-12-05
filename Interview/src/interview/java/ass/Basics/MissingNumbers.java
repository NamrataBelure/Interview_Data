package interview.java.ass.Basics;

public class MissingNumbers {

	public static void main(String[] args) {
		int a[]={2,3,8,9,5,6,4,1};
		int totalNO=9;
		int sum=0;
		int missingnum=totalNO*((totalNO+1)/2);
		for (int i : a) {
			sum+=i;
		}	
		System.out.println("Addition of Array is:"+sum);
		System.out.println("missing number of array is"+(missingnum-sum));
	}

}
