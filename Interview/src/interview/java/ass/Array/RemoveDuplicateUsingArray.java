package interview.java.ass.Array;

public class RemoveDuplicateUsingArray {

	public static void main(String[] args) {
		int a[]={1,2,3,2,4,5,6};
		System.out.print("All values are:");
		for (int i : a) {
			System.out.print(""+i);
		}
		for (int i = 0; i < a.length-1; i++) {
			for (int j =i+1; j < a.length; j++) {
				if (a[i]==a[j]&& i!=j) {
					System.out.println("\nDuplicate Array is:"+a[i]);
				}
			}
		}
	}
}
